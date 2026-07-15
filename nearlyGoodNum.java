
import java.io.*;
import java.util.*;
public class nearlyGoodNum {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){

            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            if(b==1){
                sb.append("NO").append("\n");

            }else if(a + a*(b+1) == a*b){
                sb.append("YES").append("\n");
                sb.append(a + " " + a*(b+1) + " " + a*b).append("\n");

            }else if(a + a*b == a*(b+1)){
                sb.append("YES").append("\n");
                sb.append(a + " " + a*b + " " + a*(b+1)).append("\n");

            }else sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }
}
