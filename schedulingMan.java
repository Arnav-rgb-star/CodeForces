
import java.io.*;
import java.util.*;
public class schedulingMan {
    static boolean can(int cnt[],int t){
        int n=cnt.length;
        long extra=0;
        long h=0;

        for(int i=1;i<n;i++){
            if(t>cnt[i]) h+=(t-cnt[i])/2;
            else extra+=(cnt[i]-t);
        }
        if(h>=extra) return true;
        else return false;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int a[]=new int[m];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<m;i++) a[i]=Integer.parseInt(st.nextToken());
            
            int cnt[]=new int[n+1];
            for(int i=0;i<m;i++){
                cnt[a[i]]++;
            }
            int l=0;
            int r=2*m;
            int ans=2*m;

            while(l<=r){
                int time= l + (r-l)/2;
                if(can(cnt,time)){
                    ans=time;
                    r=time-1;
                }else l=time+1;
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
