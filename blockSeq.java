
import java.io.*;
import java.util.*;
public class blockSeq {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a[]=new int[n];

            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());

            int dp[]=new int[n+1];

            dp[n]=0;

            for(int i=n-1;i>=0;i--){
                int notTake=1+dp[i+1];
                int take=Integer.MAX_VALUE;
                if(i+a[i] <n) take=dp[i+a[i]+1];

                dp[i]=Math.min(take,notTake);
            }
            sb.append(dp[0]).append("\n");
        }
        System.out.println(sb);
    }
}
