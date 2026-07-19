import java.io.*;
import java.util.*;

public class yetAnotherCons{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            long m = Long.parseLong(st.nextToken());

            if(m<k){
                sb.append("NO").append("\n");
                continue;
            }

            sb.append("YES").append("\n");

            for(int i=1;i<=n;i++){

                if(i%k==0){
                    sb.append(m-k+1);
                }
                else{
                    sb.append(1);
                }

                if(i<n) sb.append(" ");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}