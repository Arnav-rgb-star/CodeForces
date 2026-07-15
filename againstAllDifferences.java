
import java.io.*;
import java.util.*;
public class againstAllDifferences {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a[]=new int[n+1];
            ArrayList<Integer>[] pos = new ArrayList[n+1];

            for(int i=1;i<=n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                pos[i]=new ArrayList<>();
            }
            int dp[]=new int[n+1];

            for(int i=1;i<=n;i++){
                int notTake=dp[i-1];
                pos[a[i]].add(i);
                
                int cnt=pos[a[i]].size();

                if(cnt>=a[i]){
                    int start = pos[a[i]].get(cnt - a[i]);
                    dp[i]=dp[start-1]+a[i];
                }
                dp[i]=Math.max(notTake,dp[i]);
            }
            sb.append(dp[n]).append("\n");
        }
        System.out.println(sb);
    }
}
