
import java.util.*;
import java.io.*;
public class lessOrEqual {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        long a[]=new long[n];
        for(int i=0;i<n;i++) a[i]=Long.parseLong(st.nextToken());

        Arrays.sort(a);
        if(k==0){
            if((a[0]-1)<=0) System.out.println(-1);
            else System.out.println(a[0]-1);
        }else{
            long val=a[k-1];
            if(k<n && a[k-1]==a[k]) System.out.println(-1);
            else System.out.println(a[k-1]);
        }
    }    
}
