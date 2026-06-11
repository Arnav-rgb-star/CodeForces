
import java.util.*;
public class PermSwap {

    public static int GCD(int a,int b){
        if(a==0) return b;
        else return GCD(b%a,a);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int m=0 ; m<t ; m++){
            int n = in.nextInt();
            int[] a = new int[n+1];
            int[] count = new int[n+1];

            for(int i=1 ; i<=n ; i++){
                a[i] = in.nextInt();
                count[i] = Math.abs(a[i]-i);
            }
            int gcd = count[1];
            for(int i=2 ; i<=n ; i++){
                gcd = GCD(gcd,count[i]);
            }

            list.add(gcd);
        }

        for(int m=0 ; m<t ; m++){
            System.out.println(list.get(m));
        }
    }
}
