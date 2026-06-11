
import java.io.*;
import java.util.*;
public class chatBan {

    public static long sum(long m,long k){
        long s;

        if(m<=k) s = ((m)*(m+1))/2;
        else{
            long a = (2*k-1)-m;
            s= k*k - (a*(a+1))/2;
        }
        return s;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long k=Long.parseLong(st.nextToken());
            long x=Long.parseLong(st.nextToken());

            long l=0;
            long r=(2*k)-1;

            while(l<r){
                long m= l+(r-l)/2;
                if(x>sum(m,k)) l=m+1;
                else r=m;
            }
            sb.append(l).append("\n");
        }
        System.out.println(sb);
    }
}
