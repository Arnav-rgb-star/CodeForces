
import java.io.*;
import java.util.*;
public class vesselHeight {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int h[]=new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++) h[i]=Integer.parseInt(st.nextToken());
            
            int l[]=new int[n];
            int r[]=new int[n];


            for(int i=0;i<n;i++){
                int max=0;
                long sum=0;

                Arrays.fill(l, 0);
                Arrays.fill(r, 0);

                for(int j=1;j<n;j++){
                    max=Math.max(h[(i+j-1)%n],max);
                    r[(j+i)%n]=max;
                }
                max=0;
                for(int j=1;j<n;j++){
                    int idx = (i-j+n)%n;
                    max=Math.max(max,h[idx]);
                    l[idx]=max;
                }
                for(int k=0;k<n;k++){
                    sum+=Math.min(l[k],r[k]);
                }
                sb.append(sum + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
