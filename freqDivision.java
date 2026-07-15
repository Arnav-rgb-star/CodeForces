import java.io.*;
import java.util.*;

public class freqDivision{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a[]=new int[n];

            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());

            int c[]= new int[n+1];
            int d[]= new int[n+1];

            for(int i=1;i<=n;i++){

                if(a[i-1]==1) c[i]=1+c[i-1];
                else  c[i]=c[i-1]-1;

                if(a[i-1]==3) d[i]=d[i-1]-1;
                else d[i]=d[i-1]+1;
            }

            int max[]=new int[n+1];
            max[n-1]=d[n-1];

            for(int i=n-2;i>=1;i--){
                max[i]=Math.max(max[i+1],d[i]);
            }

            boolean gubba=false;

            for(int i=1;i<=n-2;i++){
                if(c[i]>=0 && max[i+1]>=d[i]){
                    gubba=true;
                    break;
                }
            }

            
            if(gubba) sb.append("YES\n");
           
            else sb.append("NO\n");
        }

        System.out.println(sb);
    }
}