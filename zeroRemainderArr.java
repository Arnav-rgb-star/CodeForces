
import java.io.*;
import java.util.*;
public class zeroRemainderArr {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            long a[]=new long[n];

            st = new StringTokenizer(br.readLine());
            long zeros=0;

            for(int i=0;i<n;i++){
                a[i]=Long.parseLong(st.nextToken());
                a[i]=a[i]%k;
                if(a[i]==0) ++zeros;
            }
            if(zeros==n){
                sb.append(0).append("\n");
                continue;
            }
            Arrays.sort(a);
            for(int i=0;i<n/2;i++){
                long temp=a[i];
                a[i]=a[n-i-1];
                a[n-i-1]=temp;
            }
            long m=0;
            long x=1;

            for(int i=0;i<n;i++){
                if(a[i]==0) break;
                m=1;
                long req = k-a[i];
                while((i+1)<n && a[i]==a[i+1]){
                    ++m;
                    ++i;
                }
                long last = req+(m-1)*k;
                x = Math.max(x,last);
            }
            sb.append(x+1).append("\n");
        }
        System.out.println(sb);
    }
}
