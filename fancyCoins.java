
import java.io.*;
import java.util.*;
public class fancyCoins{
    static boolean possible(int c,int a1,int ak,int m,int k){
        int fancy=0;
        int nk = (m/k);
        int n1 = m%k;

        if(a1<n1){
            n1-=a1;
            fancy+=n1;
            a1=0;
        }else a1-=n1;

        int usek = Math.min(nk,ak);
        nk-=usek;

        int replace=Math.min(nk,a1/k);
        nk-=replace;
        fancy+=nk;

        return fancy<=c;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int a1 = Integer.parseInt(st.nextToken());
            int ak = Integer.parseInt(st.nextToken());

            int ans=0;
            int l=0;
            int r=m;

            while(l<=r){
                int mid = l + (r-l)/2;
                if(possible(mid,a1,ak,m,k)){
                    ans=mid;
                    r=mid-1;
                }else l=mid+1;
            }
            sb.append(ans).append("\n");
        }

        System.out.println(sb);
    }
}
