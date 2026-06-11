
import java.io.*;
import java.util.StringTokenizer;
public class cellularNetwork {

    static int lb(int []b,int target){
        int l=0;
        int r=b.length-1;

        while(l<=r){
            int m=l+(r-l)/2;
            if(b[m]<target){
                l=m+1;
            }else{
                r=m-1;
            }
        }
        if(r<0) return b[0]; 
        return b[r];
    }

    static int ub(int []b,int target){
        int l=0;
        int r=b.length-1;

        while(l<=r){
            int m=l+(r-l)/2;
            if(b[m]<target){
                l=m+1;
            }else if(b[m]==target){
                return b[m];
            }else{
                r=m-1;
            }
        }
        if(l>=b.length) return b[b.length-1];
        return b[l];
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int a[]=new int[n];
        int b[]=new int[m];

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++) b[i]=Integer.parseInt(st.nextToken());

        int max=0;
        for(int i=0;i<n;i++){
           
            int l = lb(b,a[i]);
            int r = ub(b,a[i]);

            int left =Math.abs(a[i]-l);
            int right=Math.abs(r-a[i]);

            max=Math.max(max,Math.min(left,right));
        }
        System.out.println(max);
    }
}
