

import java.io.*;
import java.util.*;
public class friendsRest {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            int x[] = new int[n];
            int y[] = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++) x[i]=Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) y[i]=Integer.parseInt(st.nextToken());

            int d[]=new int[n];
            for(int i=0;i<n;i++) d[i]= y[i]-x[i];

            Arrays.sort(d);
            int i=0;
            int j=n-1;
            int cnt=0;

            while(i<j){
                if(d[i]+d[j]>=0){
                    ++cnt;
                    ++i;
                    --j;
                }else{
                    ++i;
                }
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}
