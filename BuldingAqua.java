
import java.util.*;
import java.io.*;
public class BuldingAqua {
    public static  boolean func(long m,int []a,int w){
        long cap=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<m){
                cap+=(m-a[i]);
            }
        }
        if(w<cap){
            return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        ArrayList<Long> ans = new ArrayList<>();

        for(int k=0;k<t;k++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int w  =Integer.parseInt(st.nextToken());

            int a[] = new int[n];
            st=new StringTokenizer(br.readLine());
            long h=0;

            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());

            long s=1;
            long e=(long)Math.pow(10, 13);
            while(s<=e){
                long m = s+(e-s)/2;
                if(func(m,a,w)){
                    h=m;
                    s=m+1;
                }
                else{
                    e=m-1;
                }
            } 
            ans.add(h);
        }

        for(int m=0;m<t;m++) System.out.println(ans.get(m));
    }
}


