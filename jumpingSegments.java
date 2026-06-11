
import java.io.*;
import java.util.*;
public class jumpingSegments {
    public static boolean check(int q[][],int n,int m){    
        if((m-q[0][0])<0) return false;

        int l=0;
        int r=0;

        for(int i=0;i<n;i++){
            l-=m;
            r+=m;

            l=Math.max(l,q[i][0]);
            r=Math.min(r,q[i][1]);
            if(l>r) return false;
        }
        return true;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int q[][]=new int[n][2];
            int max=Integer.MIN_VALUE;

            for(int i=0;i<n;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                q[i][0]=Integer.parseInt(st.nextToken());
                q[i][1]=Integer.parseInt(st.nextToken());
                max=Math.max(max,q[i][1]);
            }
            int l=q[0][0];
            int r=max; 
            int ans=0;

            while(l<=r){
                int m = l+(r-l)/2;
                if(check(q,n,m)){
                    ans=m;
                    r=m-1;
                }else l=m+1;
            }
            sb.append(ans).append("\n");
        }

        System.out.println(sb);
    }
}
