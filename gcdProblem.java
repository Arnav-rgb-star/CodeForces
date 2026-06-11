
import java.io.*;
import java.util.*;
public class gcdProblem{

    static long gcd(long a,long b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }

    static long lcm(long a,long b) {
        return (a*b)/gcd(a,b);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t--> 0) {
            int n = Integer.parseInt(br.readLine());

            long[] a = new long[n];
            long[] b = new long[n];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i= 0;i<n;i++) {
                a[i]=Long.parseLong(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());

            for (int i= 0;i<n;i++) {
                b[i]=Long.parseLong(st.nextToken());
            }

            int ans=0;

            for (int i=0;i<n;i++) {
                if (i==0){
                    long g = gcd(a[0],a[1]);
                    
                    if(g<a[0]) ans++;
                } 
                else if(i==(n-1)){
                    long g = gcd(a[n-2],a[n-1]);
                    if(g<a[n-1]) ans++;

                }else{
                    long left = gcd(a[i-1],a[i]);
                    long right = gcd(a[i],a[i+1]);
                    long g = lcm(left,right);

                    if(g<a[i]) ans++;
                }
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}