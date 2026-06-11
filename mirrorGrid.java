
import java.io.*;
public class mirrorGrid {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(t-->0){
            int n = Integer.parseInt(br.readLine());

            int [][]a=new int[n][n];
            String str[] = new String[n];

            for(int i=0;i<n;i++){
                str[i]=br.readLine();
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j]=str[i].charAt(j)-'0';
                }
            }
            int b[][] = new int[n][n];
            int c[][] = new int[n][n];
            int d[][] = new int[n][n];
            
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    b[i][j]=a[n-1-j][i];
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    c[i][j]=b[n-1-j][i];
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    d[i][j]=c[n-1-j][i];
                }
            }
            
            int cnt=0;

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){

                    int zeros=0,ones=0;
                    if(a[i][j]==1) ++ones;
                    else ++zeros;

                    if(b[i][j]==1) ++ones;
                    else ++zeros;

                    if(c[i][j]==1) ++ones;
                    else ++zeros;

                    if(d[i][j]==1) ++ones;
                    else ++zeros;

                    if(ones>=zeros){
                        cnt+=zeros;

                        a[i][j]=1;
                        b[i][j]=1;
                        c[i][j]=1;
                        d[i][j]=1;
                    }else{
                        cnt+=ones;

                        a[i][j]=0;
                        b[i][j]=0;
                        c[i][j]=0;
                        d[i][j]=0;
                    }
                }
            }

            sb.append(cnt/4).append("\n");
        }
        System.out.println(sb);
    }
}
