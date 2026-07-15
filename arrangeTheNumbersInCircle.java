
import java.io.*;
import java.util.*;
public class arrangeTheNumbersInCircle {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a[]=new int[n];
            boolean am=true;

            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                if(am && a[i]>1 && i!=(n-1)){
                    am=false;
                }
            }
            long g;
            long ans=0;
            if(n==1){
                if(a[0]>=3) sb.append(a[0]).append("\n");
                else sb.append(0).append("\n");
                continue;
            }

            if(am && a[n-1]!=1){
                g = a[n-1]/2;
                ans=a[n-1]+Math.min(g,n-1);
                sb.append(ans).append("\n");
                continue;
            }
            g=0;
            for(int i=(n-1);i>=0;i--){
                if(a[i]>1){
                    ans+= a[i]*1L;
                    g+= (a[i]*1L)/2-1;
                }else{
                    if(g>0 && a[i]==1){
                        ++ans;
                        --g;
                    }
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
