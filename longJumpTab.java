
import java.io.*;
import java.util.*;
public class longJumpTab{
    static long dp[];

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            long a[]=new long[n+1];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=1;i<=n;i++) a[i]=Long.parseLong(st.nextToken());
            dp=new long[n+1];  

            long max=0;
            for (int i=n;i>=1;i--){
                dp[i]=a[i];
                int next = i + (int)a[i];

                if(next<=n){
                    dp[i]+=dp[next];
                }
                max = Math.max(max,dp[i]);
            }
            sb.append(max).append("\n");
        }

        System.out.println(sb);
    }
}
