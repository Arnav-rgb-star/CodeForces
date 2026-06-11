
import java.util.*;
import java.io.*;
public class differentailSort {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n =Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a[] = new int[n];
            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());

            boolean amrizz=false;
            if(a[n-2]>a[n-1]){
                System.out.println("-1");
                continue;
            }

            for(int i=1;i<n;i++){
                if(a[i-1]>a[i]){
                    amrizz=true;
                    break;
                }
            }
            if(!amrizz){
                System.out.println(0);
                continue;
            }
            if(a[n-1]<0){
                System.out.println("-1");
                continue;
            }
            System.out.println(n-2);
            for(int i=n-2;i>0;i--){
                System.out.println(i + " " + (n-1) +" " + (n));
            }
        }
    }
}
