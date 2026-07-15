
import java.io.*;
import java.util.*;
public class yaroslavAndProd{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            long[] prefix = new long[n+1];

            st = new StringTokenizer(br.readLine());

            for(int i=1;i<=n;i++) {
                long a= Long.parseLong(st.nextToken());
                prefix[i] = prefix[i-1]+ a;
            }

            int[] b = new int [m];

            st = new StringTokenizer(br.readLine());

            for(int i=0;i<m;i++) b[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(b);
            long ans = 0;
            int p = 0;

            for(int i=0;i<m;i++) {
                long sum = prefix[b[i]]-prefix[p];

                ans+= Math.abs(sum);
                p=b[i];
            }

            ans+= prefix[n]-prefix[p];

            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}
