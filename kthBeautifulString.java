import java.io.*;
import java.util.*;

public class kthBeautifulString{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            long n=Long.parseLong(st.nextToken());
            long k=Long.parseLong(st.nextToken());

            long p=1;
            while(p*(p+1)/2<k) p++;

            long l=n-p;
            long r=l + k - (p*(p-1))/2;

            for(long i=1;i<=n;i++){
                if(i==l||i==r) sb.append('b');
                else sb.append('a');
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}