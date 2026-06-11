
import java.io.*;
import java.util.*;

public class annaValentine {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int a[]=new int[n];
            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());

            Arrays.sort(a);
            int d[]=new int[n];
            int z[]=new int[n];
            int sum=0;
            
            for(int i=0;i<n;i++){
                d[i] = (int)Math.log10(a[i])+1;
                sum+=d[i];

                while((a[i]% 10)==0){
                    ++z[i];
                    a[i]/=10;
                }
            }
            Arrays.sort(z);
            for(int i=(n-1);i>=0;i-=2){
                sum-=z[i];
            }
            if(sum>=(m+1)) sb.append("Sasha").append("\n");
            else sb.append("Anna").append("\n");
        }

        System.out.println(sb);
    }
}
