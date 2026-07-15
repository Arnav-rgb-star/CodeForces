
import java.io.*;
import java.util.*;
public class formingTraingles {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            long freq[]=new long[n+1];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                int v = Integer.parseInt(st.nextToken());
                ++freq[v];
            }
            long small = 0;
            long sum= 0;

            for(int i=0;i<=n;i++){
                long f = freq[i];

                if(f>=3) sum+= ((f)*(f-1)*(f-2))/6; 
                if(f>=2) sum+= ((f*(f-1))/2)*small;
                small+=f;
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
