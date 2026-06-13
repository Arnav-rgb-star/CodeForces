
import java.io.*;
import java.util.*;
public class gamesOnTheTrain{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int M=-1;
            int m=Integer.MAX_VALUE;

            int h[]=new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) h[i]=Integer.parseInt(st.nextToken());

            for(int i=0;i<n;i++){
                M=Math.max(M,h[i]);
                m=Math.min(h[i],m);
            }
            sb.append(M-m+1).append("\n");
        }

        System.out.println(sb);
    }
}
