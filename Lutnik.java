
import java.util.*;
public class Lutnik{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while(t-- >0){
        int n = in.nextInt();
        long[] arr = new long[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = in.nextLong();
        }
        Arrays.sort(arr);
        int ones=0,zeros=0;
        for(int i=0 ; i<n ; i++){
            if(arr[i] > 1){
                break;
            }
            if(arr[i] == 1){
                ++ones;
            }
            else if(arr[i] == 0){
                ++zeros;
            }
        }

        System.out.println((long)(Math.pow(2, zeros)*ones));
        }
    }
}