
import java.io.*;
import java.util.*;
public class candyBox {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int a[]=new int[n];
            int cnt[]=new int[n+1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                cnt[a[i]]++;
            }
            Arrays.sort(cnt);
            long sum=cnt[n];
            long last = cnt[n];

            for(int i=n-1;i>=0;i--){
                if(cnt[i]==0 || last<=0) break;
                if(cnt[i]<last){
                    last= (long)cnt[i];
                    sum+= (long)cnt[i];
                }else{
                    last--;
                    sum+=last;
                }
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
