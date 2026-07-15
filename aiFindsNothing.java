
import java.io.*;
import java.util.*;
public class aiFindsNothing {
    static long mod =  998244353;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int k = Integer.parseInt(br.readLine());

        while(k-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            long r = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            long cells = (n*m)-(n-r+1)*(m-c+1);
            long ans=1;
            long t=2;
            while(cells>0){
                if(cells%2==0){
                    t=(t%mod)*(t%mod);
                    cells/=2;
                }else{
                    ans=(t%mod)*(ans%mod);
                    --cells;
                }
            }
            sb.append(ans%mod).append("\n");
        }

        System.out.println(sb);
    }
}
