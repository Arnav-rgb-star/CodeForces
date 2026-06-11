
import java.io.*;
import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class scuba {

    public static long func(long prefix[],long maxPrefix[],long k){
        int s=0;
        int e=prefix.length-1;
        long ans = 0;
        
        while(s<=e){
            int m= s + (e-s)/2;

            if(maxPrefix[m]<=k){
                ans=prefix[m];
                s=m+1;
            }else{
                e=m-1;
            }
        }

        return ans;
    } 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            
            long a[] = new long[n];
            long k[] = new long[q];
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++) a[i]=Long.parseLong(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<q;i++) k[i]=Long.parseLong(st.nextToken());

            long prefix[]=new long[n];
            long maxPrefix[]=new long[n];
            prefix[0]=a[0];
            maxPrefix[0]=a[0];

            for(int i=1;i<n;i++){
                prefix[i]=prefix[i-1]+a[i];
                maxPrefix[i]=Math.max(maxPrefix[i-1],a[i]); 
            }

            for(int i=0;i<q;i++){
                long val=func(prefix,maxPrefix,k[i]);
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
