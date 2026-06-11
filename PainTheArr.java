
import java.util.*;
public class PainTheArr {

    public static long gcd(long a,long b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        LinkedList<Long> ans  =new LinkedList<>();

        for(int k=0;k<t;k++){
            int n=in.nextInt();
            long[] a = new long[n];
            boolean even=true,odd=true;
            long hcf1=0,hcf2=0;
            for(int i=0;i<n;i++){
                a[i]=in.nextLong();
                if(i%2==0){
                    hcf1 = gcd(hcf1,a[i]);
                }
                else{
                    hcf2 = gcd(hcf2,a[i]);
                }
            }
            for(int i=0;i<n;i+=2){
                if(a[i]%hcf2==0){
                    odd=false;
                    break;
                }
            }
            for(int i=1;i<n;i+=2){
                if(a[i]%hcf1==0){
                    even=false;
                    break;
                }
            }
            if(even){
                ans.add(hcf1);
            }
            else if(odd){
                ans.add(hcf2);
            }
            else{
                ans.add(0L);
            }

        }

        for(int k=0;k<t;k++){
            System.out.println(ans.get(k));
        }
    }
}
