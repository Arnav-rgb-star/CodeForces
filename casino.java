
import java.util.*;
import java.io.*;
public class casino {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());


            int a[][]= new int[n][m];
            for(int i=0;i<n;i++){
                st =new StringTokenizer(br.readLine());
                for(int j=0;j<m;j++){
                    a[i][j]=Integer.parseInt(st.nextToken());
                }
            }
            int b[][]=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    b[i][j]=a[j][i];
                }
            }
            for(int i=0;i<m;i++){
                Arrays.sort(b[i]);
            }
            long sum=0;

            for(int i=0;i<m;i++){
                int l=0;
                int r=n-1;

                int x=(n-1);
                while(l<r){
                    sum+= (long)x*(b[i][r]-b[i][l]);
                    x-=2;
                    l++;
                    --r;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
