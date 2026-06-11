
import java.io.*;
import java.util.StringTokenizer;
public class plusMinusPerm {

    public static long gcd(long a,long b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());

            long n=Long.parseLong(st.nextToken());
            long x=Long.parseLong(st.nextToken());
            long y=Long.parseLong(st.nextToken());
            
            long mul = (long)x*y;
            long div = gcd(x,y);
            long lcm = mul/div;

            long sum = n*(n+1);
            
            long val1 = (n/x)-(n/lcm);
            long val2 = n-val1;
            long val3 = (val2)*(val2+1);
            long X = sum- val3;

            long val4 = (n/y)-(n/lcm);
            long Y = val4*(val4+1);

            X = X-Y;
            X/=2;
            sb.append(X).append("\n");
        }
        System.out.println(sb);
    }
}