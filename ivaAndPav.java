
import java.io.*;
import java.util.StringTokenizer;
public class ivaAndPav {

    public static int Query(int prefix[][],int l,int r){
        
        int len=r-l+1;
        int ans=0;

        for(int i=0;i<32;i++){
            int gubba = prefix[r+1][i]-prefix[l][i];
            if(gubba==len) ans = ans | (1<<i);
        }
        return ans;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb  = new StringBuilder();

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int a[]=new int[n];
            
            StringTokenizer st =new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());
            int query = Integer.parseInt(br.readLine());

            int q[][]=new int[query][2];
            for(int i=0;i<query;i++){
                st = new StringTokenizer(br.readLine());
                q[i][0]=Integer.parseInt(st.nextToken());
                q[i][1]=Integer.parseInt(st.nextToken());
            }
            int prefix[][]=new int[n+1][32];

            for(int i=0;i<n;i++){
                for(int bit=0;bit<32;bit++){
                    prefix[i+1][bit]=prefix[i][bit];

                    int b = a[i] & (1<<bit);
                    if(b!=0) ++prefix[i+1][bit];
                }
            }
            for(int i=0;i<query;i++){
                int l=q[i][0]-1;
                int k=q[i][1];

                int s=l;
                int e=n-1;
                
                while(s<=e){
                    int m = s+(e-s)/2;
                    int val = Query(prefix,l,m);
                    if(val>=k) s=m+1;
                    else e=m-1;
                }
                
                if(e<l) sb.append(-1).append(" ");
                else sb.append(e + 1).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
