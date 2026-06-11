
import java.util.*;
import java.io.*;

public class tenzingBooks {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder(); 
        
        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            int a[][]=new int[3][n];

            for(int i=0;i<3;i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<n;j++){
                    a[i][j]=Integer.parseInt(st.nextToken());
                }
            }

            int val=0;
            for(int i=0;i<3;i++){
                for(int j=0;j<n;j++){

                    if((x|a[i][j])!=x) break;
                    else val|= a[i][j];
                }
            }
            if(val==x) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }

        System.out.println(sb);
    }
}
