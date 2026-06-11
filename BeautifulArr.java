
import java.util.*;
public class BeautifulArr {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-- >0){
            int n = in.nextInt();
            long k = in.nextLong();
            long b = in.nextLong();
            long s = in.nextLong();
            long[] a = new long[n];
            if(b*k > s ){
                System.out.println(-1);
                continue;
            }
            a[n-1] = Math.min(s, k*b + (k-1));
            long maxSum = a[n-1] + (n-1)*(k-1);
            if(maxSum < s){
                System.out.println(-1);
                continue;
            }
            long sum=a[n-1],rem=(s-a[n-1]);

            for(int i=(n-2);i>=0 && rem>0 ; i--){
                a[i] = (k-1);
                sum+= a[i];
                if(rem < (k-1)){
                    a[i] = rem;
                    break;
                }
                rem = (s-sum);
            }
            for(long i : a){
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
}
