
import java.io.*;
import java.util.*;

public class tatarTvShow{
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int tst=Integer.parseInt(br.readLine());

        while(tst-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n =Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            String s=br.readLine();
            int[] cnt=new int[k];

            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1') cnt[i%k]++;
            }

            boolean can=true;
            for(int i=0;i<k;i++){

                if(cnt[i]%2 == 1){
                    can=false;
                    break;
                }
            }
            if(can) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.print(sb);
    }
}