
import java.io.*;
import java.util.*;
public class dolceVita {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            long a[] = new long[n+1];
            st = new StringTokenizer(br.readLine());

            for(int i=1;i<=n;i++) a[i]=Long.parseLong(st.nextToken());
            Arrays.sort(a);

            long prefix[] = new long[n+1];
            prefix[1]=a[1];

            for(int i=2;i<=n;i++) prefix[i]=prefix[i-1]+a[i];
            
            long packs=0;
            
            for(int i=1;i<=n;i++){
                if(prefix[i]>x) break;  
                
                long k = (x-prefix[i])/i + 1;
                
                if(k>0){
                    packs+=k;
                }
            }
            sb.append(packs).append("\n");
        }

        System.out.println(sb);
    }
}
