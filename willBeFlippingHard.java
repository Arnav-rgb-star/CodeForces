
import java.io.*;
import java.util.*;
public class willBeFlippingHard{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            long a[]=new long[n];
             long sum=0;

            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                sum+=a[i];
            }

            long p[]=new long[n+1];
            long s[]=new long[n+1];

            p[0]=Math.abs(a[0]);
            for(int i=1;i<n;i++){
                p[i]=p[i-1]+Math.abs(a[i]);
            }

            s[n-1]=a[n-1];
            for(int i=n-2;i>=0;i--) s[i]=s[i+1]+a[i];

            int index=-1;
           
            for(int i=0;i<n;i++){
                if(a[i]<0L) continue;

                long c=p[i]- 2*a[i];
                if(i+1 <n) c+=s[i+1];
                
                if(c>sum){
                    index=i;
                    sum=c;
                }
            }

            if (index==-1) {
                sb.append(0).append("\n\n");
                continue;
            }

            ArrayList<Integer> operations = new ArrayList<>();

            boolean flip=false;

            for(int i =index-1;i>=0;i--){
                long c=a[i];

                if(flip){
                    c=-c;
                }

                if(c>0){
                    operations.add(i + 1);
                    flip = !flip;
                }
            }

            operations.add(index + 1);
            sb.append(operations.size()).append("\n");

            for(int operation : operations){
                sb.append(operation).append(" ");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
