
import java.util.*;
public class PushingBalls {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        LinkedList<String> list = new LinkedList<>();
        
        for(int k=0;k<t;k++){
            int n=in.nextInt();
            int m=in.nextInt();
            in.nextLine();
            int [][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                String row = in.nextLine(); 
                for (int j = 0; j < m; j++) {
                    a[i][j] = row.charAt(j) - '0'; 
                }
            }
            boolean visited[][] = new boolean[n][m];
            boolean valid =true;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(a[j][i]==0){
                        break;
                    }
                    visited[j][i]=true;
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(a[i][j]==0){
                        break;
                    }
                    visited[i][j]=true;
                }
            }

            for(int i=0;i<n && valid;i++){
                for(int j=0;j<m;j++){
                    if(a[i][j]==1 && !visited[i][j]){
                        valid=false;
                        break;
                    }
                }
            }

            if(valid){
                list.add("YES");
            }
            else{
                list.add("NO");
            }
        }   

        for(int m=0;m<t;m++){
            System.out.println(list.get(m));
        }
    }
}

