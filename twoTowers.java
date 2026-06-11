

import java.uitl.*;
import java.util.StringTokenizer;
import java.io.*;
public class twoTowers {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            long d = Long.parseLong(st.nextToken());

            long min=0;
            long diff = Math.abs(a-b);
            if(a>b){
                b+=diff;
            }else{
                a+=diff;
            }
            min+=diff;
            
            if(a>c){
                min-=(a-c);
                a-=(a-c);
                min+=(d-b);
                b+=(d-b);
            }else if(b>d){
                min-=(b-d);
                b-=(b-d);
                min+=(c-a);
                a+=(c-a);
            }
            
            if(a!=c && b!=d){
                if(c<d){
                    b+=(c-a);
                    min+=(c-a);
                    min+=(d-b);
                }else{
                    a+=(d-b);
                    min+=(d-b);
                    min+=(c-a);
                }
            }
            sb.append(min).append("\n");
        }
        System.out.println(sb);
   }
}
