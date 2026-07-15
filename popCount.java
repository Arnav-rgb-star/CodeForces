
import java.io.*;
import java.util.*;
public class popCount {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder s = new StringBuilder();
        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            if(n<=k){
                s.append(n).append("\n");
                continue;
            }
            int m=1;
            int val=0;
            while(n>=m){
                int cnt=Math.min(k,n/m);
                val+=cnt;
                n-=(cnt*m);
                m*=2;
            }
            s.append(val+"\n");
        }
        System.out.println(s);
    }
}
