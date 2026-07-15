
import java.io.*;
import java.util.*;
public class allWentSide {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a[]=new int[n];
            long sum=0;

            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                sum+= (long)a[i];
            }
            long fix=0;

            int suffix[]=new int[n+1];
            suffix[n]=a[n-1];

            for(int i=(n-1);i>=0;i--){
                suffix[i]=Math.min(suffix[i+1],a[i]);
                fix+= (long)suffix[i];

            }
            long drop=0;
            int freq[]=new int[n+1];
            for(int i=0;i<n;i++){
                freq[suffix[i]]++;
                drop = (long)Math.max(drop,sum-fix-1+freq[a[i]]);
            }
            sb.append(drop).append("\n");
        }
        System.out.println(sb);
    }
}
