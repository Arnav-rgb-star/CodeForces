

import java.io.*;
import java.util.*;
public class xorArray {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x =Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            long []a = new long[n+1];
            long prefix[] = new long[n+1];

            for(int i=1;i<=n;i++){
                prefix[i]=i;
                if(i==y) prefix[i]=(x-1);
                
                a[i]=prefix[i]^prefix[i-1];
            }
            

            for(int i=1;i<=n;i++){
                sb.append(a[i] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
