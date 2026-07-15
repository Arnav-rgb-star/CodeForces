
import java.io.*;
import java.util.*;
public class jhonnyAndRatingDrop{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            long n = Long.parseLong(br.readLine());
            long changes=0L;
            long mul=1;

            while((n/mul)!=0){
                changes+=(n/mul);
                mul*=2L;
            }
            sb.append(changes).append("\n");
        }

        System.out.println(sb);
    }
}
