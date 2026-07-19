
import java.io.*;
import java.util.*;

public class deleteAndCon{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){

            StringTokenizer st=new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            long[]a = new long[n];
            st = new StringTokenizer(br.readLine());

            long sum = 0;

            for(int i=0;i<n;i++){
                a[i] = Long.parseLong(st.nextToken());
                sum+= a[i]- c;
            }

            Arrays.sort(a);

            for(int i=0;i<n/2;i++){
                if(a[i]<c) sum+= (c-a[i]);
                else break;
            }

            sb.append(sum).append("\n");
        }

        System.out.print(sb);
    }
}
