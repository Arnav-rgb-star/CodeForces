
import java.util.*;
public class EqualWithMod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Long> ans = new ArrayList<>();
        int t = in.nextInt();

        for(int m=0;m<t;m++){
            int n = in.nextInt();
            long []a = new long[n];

            for(int i=0;i<n;i++) a[i] = in.nextLong();
            boolean odd=false,even=false;

            for(int i=0;i<n;i++){
                if((a[i]&1)==1) odd =true;
                else even = true;

                if(even && odd) break;
            }
            if(even && odd){
                ans.add(2L);
            }
            else{
                for(long i=4;i<(long)Math.pow(10, 18);i*=2){
                    long [] b = Arrays.copyOf(a, n);
                    HashSet<Long> set = new HashSet<>();
                    long k=4;
                    for(int j=0;j<n;j++){
                         k = b[j]%i;
                        if(!set.contains(k)){
                            set.add(k);
                        }
                    }
                    if(set.size()==2){
                        ans.add(i);
                        break;
                    }
                }
            }

        }
        for(int i=0;i<t;i++) System.out.println(ans.get(i));
    }
}
