
import java.io.*;
import java.util.*;
public class goodTimesGoodTimes {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            long x = Long.parseLong(br.readLine());

            int d =(int)Math.log10((double)x)+1;
            
            long pow=(long)Math.pow(10,d);

            long y = pow+1;

            sb.append(y).append("\n");
        }

        System.out.println(sb);
    }
}
