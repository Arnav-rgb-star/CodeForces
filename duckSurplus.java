
import java.io.*;
import java.util.*;
public class duckSurplus {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st= new StringTokenizer(br.readLine());
            long a[]=new long[n];

            for(int i=0;i<n;i++){
                a[i]=Long.parseLong(st.nextToken());
            }
            long prev=0;
            for(int i=1;i<n;i++){
                if(a[i-1]>a[i]){
                    prev= a[i]+a[i-1];
                    a[i-1]=a[i];
                    a[i]=prev;
                }
            }
            sb.append(a[n-1]).append("\n");
        }

        System.out.println(sb);
    }
}
