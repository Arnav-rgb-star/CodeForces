
import java.io.*;
import java.util.*;
public class findTheSpruce{
    static char grid[][];
    static boolean visited[][];
    static long dp[][];

    static long func(int i,int j){
        

        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length) return 0;

        if(grid[i][j]=='.') return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        long left = func(i+1,j-1);
        long down = func(i+1,j);
        long right = func(i+1,j+1);

        return dp[i][j] = (1+Math.min(down,Math.min(left,right)));
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st =  new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            grid=new char[n][m];
            visited = new boolean[n][m];

            for(int i=0;i<n;i++){
                String str = br.readLine();
                for(int j=0;j<m;j++){
                    grid[i][j]=str.charAt(j);
                }
            }
            long count=0;
            dp=new long[n+1][m+1];
            for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++) {
                    count+=func(i,j);
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
