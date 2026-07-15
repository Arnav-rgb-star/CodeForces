
import java.io.*;
import java.util.*;
public class divideAndConquer {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(x%y ==0) sb.append("YES\n");
            else sb.append("NO\n");
        }

        System.out.println(sb);
    }
}
