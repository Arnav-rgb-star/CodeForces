
import java.util.*;
import java.io.*;
public class removeSmallMul {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            int b[] = new int[n+1];
            String str = br.readLine();

            for(int i=1;i<=n;i++) b[i]=str.charAt(i-1)-'0';

            boolean  visited[] = new boolean[n+1];
            Arrays.fill(visited,false);
            long cost=0;

            for(int i=1;i<=n;i++){

                    for(int val=i;val<=n;val+=i){
                        if(b[val]==1 ) break;
                        if(visited[val]) continue;

                        if(b[val]==0 && !visited[val]){
                            visited[val]=true;
                            cost+=i;
                        }
                            
                    }

            }
            sb.append(cost).append("\n");
        }
        System.out.println(sb);;
    }
}
