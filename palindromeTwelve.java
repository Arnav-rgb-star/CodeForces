
import java.io.*;
import java.util.*;
public class palindromeTwelve {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            long n =Long.parseLong(br.readLine());
            long r = n%12;
            
            if(r==10){
                r=22;
            }
            long b=n-r;
            if(b<0) sb.append(-1).append("\n");
            else sb.append(r + " " +b).append("\n");
        }

        System.out.println(sb);
    }
}
