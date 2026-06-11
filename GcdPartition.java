
import java.util.*;
import java.io.*;

public class GcdPartition {
 
    public static long gcd(long a,long b){
    if(b==0) return a;
    else return gcd(b, a%b);
}
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        ArrayList<Long> list= new ArrayList<>();

        for(int m=0;m<t;m++){
            
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int [] a = new int[n];
            long [] prefix = new long[n];

            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());
            prefix[0] = a[0];

            for(int i=1;i<n;i++) prefix[i] = prefix[i-1]+a[i];
            long max=1;

            for(int i=n-2;i>=0;i--){
                max = Math.max(max,gcd(prefix[i],prefix[n-1]));
            }
            list.add(max);

        }
        
        for(int i=0;i<t;i++) System.out.println(list.get(i));
    }    
}
