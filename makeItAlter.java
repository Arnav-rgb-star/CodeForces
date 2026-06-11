
import java.util.*;
import java.io.*;
public class makeItAlter {

    static long mod = 998244353L;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){

            String str = br.readLine();
            int n = str.length();

            long cost=0;
            long cnt=0;
            long comb=1;

            long fac[]=new long[n+1];
            fac[0]=1;

            for(int i=1;i<=n;i++){
                fac[i]=(fac[i-1]*i)%mod;
            }
            int i=0;
            long change=0;
            while(i<n){
                if(i>0 && str.charAt(i)==str.charAt(i-1)){
                    ++cnt;
                }else{
                    long check=cost;
                    cost+=cnt;
                    change+=cnt;

                    if(cnt!=0){
                        long val = cnt+1;
                        
                        comb=((comb%mod)*(val%mod))%mod;
                    }
                    cnt=0;
                }
                ++i;
            }
            if(cnt!=0){
                change+=cnt;
                long val =(cnt+1);
                comb=((comb%mod)*(val%mod))%mod;
                cost+=cnt;
            }

            if(change>1) comb=(comb*fac[(int)change])%mod;
            sb.append(cost + " " + comb).append("\n");
        }
        System.out.println(sb);
    }
}
