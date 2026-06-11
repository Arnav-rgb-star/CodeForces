
import java.util.*;
import java.io.*;
public class TNT {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        ArrayList<Long> ans = new ArrayList<>();

        for(int z=0;z<t;z++){
            int n =Integer.parseInt(br.readLine());
            int a[] = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for(int i=0;i<n;i++) a[i] = Integer.parseInt(st.nextToken());
            
            long prefix[] = new long[n];
            prefix[0]=a[0];

            for(int i=1;i<n;i++) prefix[i]=prefix[i-1]+a[i];

            ArrayList<Integer> list = new ArrayList<>();

            for(int i=1;i<n;i++){
                if(n%i==0){
                    list.add(i);
                }
            }
            long diff = 0;

            for(int m=0;m<list.size();m++){
               
                int k = list.get(m);
                int l=0;
                int r=k-1;
                long segSum = (l==0)?prefix[r]:(prefix[r]-prefix[l-1]);
                long max = segSum;
                long min = segSum;

                while(l<n && r<n){

                    segSum = (l==0)?prefix[r]:(prefix[r]-prefix[l-1]);
                    max = Math.max(segSum,max);
                    min = Math.min(segSum,min);
                    
                    l=l+k;
                    r=r+k;
                    }
                    diff = Math.max(max-min,diff);
            }
            ans.add(diff);
        }

        for(int z=0;z<t;z++){
            System.out.println(ans.get(z));
        }
    }
}
