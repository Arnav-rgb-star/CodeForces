
import java.io.*;
import java.util.*;
public class gridL {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long p = Long.parseLong(st.nextToken());
            long q = Long.parseLong(st.nextToken());

            long s=p+2*q;
            boolean found=false;
            for(long i=1;i*i<s;i++){
                if((s-i) % (2*i+1) !=0) continue;
                long gb=(s-i)/(2*i+1);
                if(gb>0 && Math.abs(gb-i)<=p){
                    sb.append(gb + " " + i).append("\n");
                    found=true;
                    break;
                }
            }
            if(!found) sb.append(-1).append("\n");
        }

        System.out.println(sb);
    }
}
