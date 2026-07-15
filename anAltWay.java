
import java.io.*;
import java.util.*;
public class anAltWay {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            long a[]=new long[n];
            long b[]=new long[n];

            for(int i=0;i<n;i++) a[i]=Long.parseLong(st.nextToken());
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++) b[i]=Long.parseLong(st.nextToken());

            long gubba=0;
            for(int i=0;i<n;i++){
                gubba+=(b[i]-a[i]);
                if(gubba<0) break;
            }
            if(gubba<0) sb.append("NO").append("\n");
            else sb.append("YES").append("\n");
        }

        System.out.println(sb);
    }
}
