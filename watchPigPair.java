import java.io.*;
import java.util.*;

public class watchPigPair{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            String s = br.readLine();

            if(2*k >n){
                sb.append(-1).append("\n");
                continue;
            }

            int ans = 0;

            for(int i=0;i<k;i++){
                if(s.charAt(i)=='L') ans++;
            }

            for(int i=n-k;i<n;i++){
                if(s.charAt(i)=='R') ans++;
            }

            sb.append(ans).append("\n");
        }

        System.out.println(sb);
    }
}