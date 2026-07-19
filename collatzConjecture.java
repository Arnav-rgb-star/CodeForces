
import java.io.*;
import java.util.*;
public class collatzConjecture{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());

            while(k!=0){

                if(x==1){
                    k%=(y-1);
                    x+=k;
                    k=0;
                    break;
                }
                long req = y - (x%y);
                if(k-req>=0){
                    k-=req;
                    x+=req;
                }else{
                    x+=k;
                    k=0;
                }
                while(x%y==0) x/=y;
            }
            sb.append(x+ "\n");
        }

        System.out.println(sb);
    }
}
