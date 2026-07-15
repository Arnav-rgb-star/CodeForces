
import java.io.*;
import java.util.*;
public class arrayRecovery{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int d[]=new int[n];
            for(int i=0;i<n;i++) d[i] = Integer.parseInt(st.nextToken());
            int a[]=new int[n];

            a[0]=d[0];
            boolean multiple=false;

            for(int i=1;i<n;i++){
                a[i]=d[i]+a[i-1];
                if(d[i]!=0 && (a[i-1]-d[i])>=0){
                    multiple=true;
                    break;
                }
            }
            if(multiple) sb.append(-1).append("\n");
            else{
                for(int i=0;i<n;i++){
                    sb.append(a[i] + " ");
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
