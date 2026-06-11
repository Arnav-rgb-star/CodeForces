
import java.util.*;
public class Jelly{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-- >0){
            long a = in.nextLong();
            long b = in.nextLong();
            int n = in.nextInt();

            long[] arr = new long[n];
            long max = 0;
            for(int i = 0 ; i<n ; i++){
                arr[i] = in.nextLong();
                max+= Math.min(arr[i] , a-1);
            }
            System.out.println(max + b);
        }
    }
}
