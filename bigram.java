
import java.io.*;
import java.util.*;

public class bigram{

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int a[]=new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());

            boolean f= false;
            boolean s= false;

            if(a.length==1){
                if(a[0]>=3) sb.append("YES\n");
                else sb.append("NO\n");
                continue;
            }

            for(int i=0;i<n;i++){

                if(a[i]>=3){
                    f=true;
                    s=true;
                    break;
                }
                else if(a[i]>=2 && !f){
                    f=true;
                }else if(a[i]>=2 && f){
                    s=true;
                    break;
                }

            if(f&&s) sb.append("YES\n");
            else sb.append("NO\n");
        }

        System.out.println(sb);
    }
}