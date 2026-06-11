
import java.util.*;
import java.io.*;
public class andZeroK {

    public static long gcd(long a,long b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            long a[]= new long[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) a[i]=Long.parseLong(st.nextToken());
            long g=a[0];
            for(int i=1;i<n;i++){
                g=gcd(g,a[i]);
            }
            if(g>1){
                for(int i=0;i<n;i++){
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }else{
                for(int i=0;i<n;i++){
                    a[i]+= ((a[i])%(k+1))*k;
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
