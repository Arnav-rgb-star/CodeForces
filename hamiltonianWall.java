
import java.io.*;
import java.util.*;
public class hamiltonianWall{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());

            char grid[][]=new char[2][n];
            grid[0] = br.readLine().toCharArray();
            grid[1] = br.readLine().toCharArray();

            boolean dp[][]=new boolean[2][n+1];
            dp[0][n]=true;
            dp[1][n]=true;

            for(int j=n-1;j>=0;j--){
                for(int i=0;i<2;i++){
                    if(grid[i][j]=='W') dp[i][j]=false;
                    else if(grid[1-i][j]=='B') dp[i][j] = dp[1-i][j+1];
                    else dp[i][j] = dp[i][j+1]; 
                }
            }

            if(dp[0][0] || dp[1][0])sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }
}
