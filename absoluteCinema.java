
import java.util.*;
import java.io.*;
public class absoluteCinema {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            int n =Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long []f = new long[n+1];

            for(int i=1;i<=n;i++) f[i]=Long.parseLong(st.nextToken());
            long []a = new long[n+1];
            long S = (f[1]+f[n])/(n-1);

            a[1]=(S+f[2]-f[1])/2;
            long sum=a[1];
            for(int i=2;i<n;i++){
                a[i]=(f[i+1]+f[i-1]-2*f[i])/2;
                sum+=a[i];
            }
            a[n]=S-sum;

            for(int i=1;i<=n;i++) sb.append(a[i] + " ");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
