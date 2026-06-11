
import java.io.*;
import java.util.*;
public class snowFlakes {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            long n=Long.parseLong(br.readLine());
            long m=100;
            boolean flag=false;

            for(long i=2L;i*i<=n;i++){
                double val = (double)n*((double)i-1)+1;

                double lg = (Math.log(val))/(Math.log((double)i));
                long pre = Math.round(lg);

                if((Math.abs(lg-pre)<1e-9) && pre>=3){
                    flag=true;
                    break;
                }
            }
            if(flag) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }

        System.out.println(sb);
    }
}
