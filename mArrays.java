
import java.util.*;
import java.io.*;
public class mArrays {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int [] a= new int[n+1];
            HashMap<Integer,Integer> map = new HashMap<>();
            st = new StringTokenizer(br.readLine());
            int count=0;

            for(int i=1;i<=n;i++){
                a[i] = Integer.parseInt(st.nextToken());
                map.put(a[i]%m,map.getOrDefault(a[i]%m,0)+1);
            }
            if(map.containsKey(0)){
                ++count;
            }

            for(int i=1;i<=m/2;i++){
                int j=(m-i);
                int x = map.getOrDefault(i,0);
                int y = map.getOrDefault(j,0);
                
                if(i==j && x>0){
                    ++count;
                }else if(x>0 || y>0){
                    int diff = Math.abs(x-y);
                    ++count;
                
                    if(diff>0) count+=diff-1;
                }

            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
