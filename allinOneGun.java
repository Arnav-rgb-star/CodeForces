
import java.io.*;
import java.util.StringTokenizer;
public class allinOneGun {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());    
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long h = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            
            long a[]=new long[n];
            long sum=0;
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){ a[i]=Long.parseLong(st.nextToken()); sum+=a[i];}
            long mag = (h-1)/sum;

            h-=((mag)*(sum));
            if(h ==0){
                sb.append((mag)*k + mag*((long)n)).append("\n");
                continue;
            }
        
            long min[]=new long[n];
            long max[]=new long[n];
            max[n-1]=a[n-1];
            min[0]=a[0];

            for(int i=1;i<n;i++) min[i]=Math.min(min[i-1],a[i]);
            for(int i=n-2;i>=0;i--) max[i]=Math.max(max[i+1],a[i]);

            long s=0;
            boolean swap=false;
            for(int i=0;i<n;i++){
                s+=a[i];
                long temp=s;
                if(i<(n-1)){
                    temp=temp-min[i]+max[i+1];
                }

                if((h-temp)<=0 || (h-s)<=0){
                    sb.append((mag)*(k+n) + (i+1)).append("\n");
                    swap=true;
                    break;
                }
            }
            if(!swap)sb.append((mag)*(k+n)+n).append("\n");
        }
        System.out.println(sb);
    }
}