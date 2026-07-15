
import java.io.*;
import java.util.*;
public class productQueriesRecursion {
    static int f(int i,boolean present[]){
        if(present[i]) return 1;
        int min=(int)1e9;

        for(int j=2;j*j<present.length;j++){
            if(i%j==0){
                int d = f(j,present)+f(i/j,present);
                min=Math.min(d,min);
            }
        }

        return min;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int a[]=new int[n+1];
            boolean present[]=new boolean[n+1];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=1;i<=n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                present[a[i]]=true;
            }
            for(int i=1;i<=n;i++){
                int val = f(i,present);
                if(val==(int)1e9) val=-1;

                sb.append(val+ " ");
            }
            sb.append("\n");
        }
            System.out.println(sb);
    }
}
