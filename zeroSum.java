

import java.io.*;
import java.util.*;
public class zeroSum{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a[]=new int[n];
            int pos=0,neg=0;

            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                if(a[i]==1) pos++;
                else neg++;
            }

            if(n%2==1){
                sb.append("NO").append("\n");
                continue;
            }else if(pos%2==(n/2)%2){
                sb.append("YES").append("\n");
            }else sb.append("NO").append("\n");
        }

        System.out.println(sb);
    }
}
