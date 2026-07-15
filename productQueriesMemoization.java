
import java.io.*;
import java.util.*;
public class productQueriesMemoization {
static final int INF = (int)1e9;

    static int f(int i,boolean[] present,int[] dp) {
        if (present[i]) return 1;
        if (dp[i]!=0) return dp[i];

        int min =INF;
        for (int j=2;j*j<=i;j++) {
            if (i%j==0) {
                int left = f(j,present,dp);
                int right = f(i/j,present,dp);

                if(left!=INF && right!=INF)  min = Math.min(min,left+right);
            }
        }
        return dp[i] = min;
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
            int dp[]=new int[n+1];

            for(int i=1;i<=n;i++){
                int val = f(i,present,dp);
                if(val==(int)1e9) val=-1;

                sb.append(val+ " ");
            }
            sb.append("\n");
        }
            System.out.println(sb);
    }
}
