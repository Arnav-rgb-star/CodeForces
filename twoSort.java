
import java.io.*;
import java.util.*;

public class twoSort {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            long a[]=new long[n];
            long cnt=0;
            long sub=0;

            for(int i=0;i<n;i++) a[i]=Long.parseLong(st.nextToken());

            for(int i=1;i<n;i++){
                if((2*(a[i])>a[i-1])){
                    ++cnt;
                }else{
                    cnt=0;
                }
                if(cnt>=k) ++sub;
            }
        sb.append(sub).append("\n");
        }
        System.out.println(sb);
    }
}
