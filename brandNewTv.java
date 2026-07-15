
import java.io.*;
import java.util.*;
public class brandNewTv {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n= Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int a[]=new int[n];
            int cnt[]=new int[n+1];

            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                cnt[a[i]]++;
            }
            boolean can=false;
            int pre[]=new int[n+1];

            for(int i=1;i<n;i++){
                pre[i]=pre[i-1];
                if(cnt[i]>0) pre[i]++;
            }

            for(int i=(n);i>=1;i--){
                if(cnt[i]==0) continue;
                if(cnt[i]%2==0){
                    can=true;
                    break;
                }
                int l=Math.max(1,i-k);
                int r=i-1;

                if(l<=r){
                    int s=pre[r]-pre[l-1];
                    if(s>0){
                        can=true;
                        break;
                    }
                }
            }

            if(!can) sb.append("NO").append("\n");
            else sb.append("YES").append("\n");
        }

        System.out.println(sb);
    }
}
