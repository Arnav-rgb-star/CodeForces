
import java.io.*;
import java.util.*;
public class neatNikita{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());   
            int a[]=new int[n];
            
            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());
            long s=0;

            boolean can  =  true;
            for(int i=0;i<n;i++ ){
                s+=(long)a[i];
                long r = 1L*(i+1)*(i+2)/2;
                if(s<r){
                    can=false;
                    break;
                }
            }
            if(can) sb.append("YES").append("\n");
            else sb.append("No").append("\n");
        }

        System.out.println(sb);
    }
}
