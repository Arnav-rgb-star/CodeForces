
import java.util.*;
import java.io.*;
import java.lang.invoke.StringConcatFactory;
public class districtConnections {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a[] = new int[n+1];
            for(int i=1;i<=n;i++) a[i]=Integer.parseInt(st.nextToken());

            boolean visited[] = new boolean[n+1];
            Arrays.fill(visited,false);
            StringBuilder sb = new StringBuilder();

            for(int i=1;i<=n;i++){
                if(!visited[i]){
                    for(int j=1;j<=n;j++){
                        if(a[i]!=a[j] && !visited[j]){
                            visited[i]=true;
                            sb.append(i + " " + j).append("\n");
                            visited[j]=true;
                        }
                    }
                }
            }

            for(int i=1;i<=n;i++){
                if(!visited[i]){
                    for(int j=1;j<=n;j++){
                        if(a[i]!=a[j] && visited[j]){
                            sb.append(i + " " + j).append("\n");
                            visited[i]=true;
                            break;
                        }
                    }
                }
            }
            boolean possible=true;
            for(int i=1;i<=n;i++){
                if(!visited[i]){
                    
                    possible=false;
                    break;
                }
                }
            if(!possible){
                System.out.println("NO");
                continue;
            }
            
            System.out.println("YES");
            System.out.print(sb);
        }
    }
}
