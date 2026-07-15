2158C

import java.io.*;
import java.util.*;
public class annoyingGame {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            long a[]=new long[n];
            long b[]=new long[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) a[i]=Long.parseLong(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) b[i]=Long.parseLong(st.nextToken());

            long add=0;
            long cS=a[0];
            long mS=a[0];
            int start=0;
            int end=0;
            int temp=0;
            for(int i=1;i<n;i++){
                if(cS<0){
                    cS=a[i];
                    temp=i;
                }else cS+=a[i];

                if(cS>mS){
                    mS=cS;
                    start=temp;
                    end=i;
                }
            }

            for(int i=start;i<=end;i++) {
                add =Math.max(add,b[i]);
            }

            if(k%2==0) sb.append(mS).append("\n");
            else sb.append(mS+add).append("\n");
        }

        System.out.println(sb);
    }
}
