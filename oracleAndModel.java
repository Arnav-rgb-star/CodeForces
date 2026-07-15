
import java.io.*;
import java.util.*;
public class oracleAndModel {
    static long f(int i,long dp[],long a[]){
        if(dp[i]!=0) return dp[i];
        dp[i]=1;

        for(int j=2*i;j<a.length;j+=i){
            if(a[i]<a[j]){
                dp[i]=Math.max(dp[i],1+f(j,dp,a));
            }
        }
        return dp[i];
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a[]=new long[n+1];

            for(int i=1;i<=n;i++) a[i]=Long.parseLong(st.nextToken());
            long dp[]=new long[n+1];
            
            long ans=1;
            for(int i=1;i<=n;i++){
                ans=Math.max(ans,f(i,dp,a));
            }
            sb.append(ans).append("\n");

        }

        System.out.println(sb);
    }
}
