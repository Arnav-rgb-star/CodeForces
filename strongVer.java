
import java.util.*;
import java.io.*;
import java.nio.BufferOverflowException;
public class strongVer {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            int n=Integer.parseInt(br.readLine());
            int []a = new int[n+1];
            int b[] = new int[n+1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=1;i<=n;i++) a[i]=Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());

            for(int i=1;i<=n;i++) b[i]=Integer.parseInt(st.nextToken());

            int diff[]=new int[n+1];

            int max=Integer.MIN_VALUE;
            
            for(int i=1;i<=n;i++){
                diff[i]=a[i]-b[i];
                max=Math.max(diff[i],max);
            }
            int cnt=0;
            ArrayList<Integer>list = new ArrayList<>();

            for(int i=1;i<=n;i++){
                if(diff[i]==max){
                    ++cnt;
                    list.add(i);
                }
            }
            sb.append(cnt).append("\n");
            for(int i=0;i<list.size();i++){
                sb.append(list.get(i) + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
