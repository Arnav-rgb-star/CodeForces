
import java.io.*;
import java.util.*;
public class fortuneTelling {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            long sum=0;
            long a[]=new long[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Long.parseLong(st.nextToken());
                sum+=a[i];
            }
            if((sum+x)%2==y%2) sb.append("Alice").append("\n");
            else sb.append("Bob").append("\n");
        }

        System.out.println(sb);
    }
}
