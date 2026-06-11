
import java.util.*;
import java.io.*;
public class findTheDiffOnes {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer  st = new StringTokenizer(br.readLine());
            int a[]=new int[n+1];
            int b[]=new int[n+1];

            for(int i=1;i<=n;i++) a[i]=Integer.parseInt(st.nextToken());
            int q=Integer.parseInt(br.readLine());
            
            b[1]=-1;
            for(int i=2;i<=n;i++){
                if(a[i]!=a[i-1]){
                    b[i]=i-1;
                }else{
                    b[i]=b[i-1];
                }
            }

            while(q-->0){
                st = new StringTokenizer(br.readLine());
                int l=Integer.parseInt(st.nextToken());
                int r=Integer.parseInt(st.nextToken());

                if(b[r]>=l){
                    sb.append(b[r] + " " + r).append("\n");
                }else{
                    sb.append(-1 + " " + -1).append("\n");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
