
import java.util.*;
import java.io.*;
public class cntOrders {

    static int up(ArrayList<Integer> a,int target){
        int idx=a.size();  
        int s=0;
        int e=a.size()-1;

        while(s<=e){
            int m = s +(e-s)/2;
            if(a.get(m)>target){
                e=m-1;
                idx=m;
            }else{
                s=m+1;
            }
        }
        return idx;
    }
    public static void main(String[] args) throws IOException{
        
        long mod = 1000000007;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();

            for(int i=0;i<n;i++) a.add(Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++) b.add(Integer.parseInt(st.nextToken()));

            Collections.sort(a);
            Collections.sort(b,Collections.reverseOrder());
            long ans = 1;

            for(int i=0;i<n;i++){
                int bound = up(a,b.get(i));
                ans = (ans*(Math.max(n-bound-i,0)) )%mod;
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
