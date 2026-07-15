
import java.io.*;
import java.util.*;
public class prefixSumAddicts{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            long p[]=new long[k];
            for(int i=0;i<k;i++) p[i]=Long.parseLong(st.nextToken());
            long a[]=new long[k];
System.err.println();

            if(k==1){
                sb.append("YES\n");
                continue;
            }
            
            boolean can=true;
            a[0]=p[0];
            for(int i=k-1;i>0;i--){
                a[i]=p[i]-p[i-1];
                if( (i+1)<k && a[i]>a[i+1]){
                    can=false;
                    break;
                }
            }
            long largest = a[1]*(n-k+1) - p[0];
            if(largest<0) can=false;

            if(can) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }

        System.out.println(sb);
    }
}
