
import java.util.*;
public class MakeZero{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-- >0){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i=0 ; i<n ;i++){
                a[i] = in.nextInt();
            }
            if(a.length % 2 == 0){
            System.out.println("2");
            System.out.println("1" + " " + n);
            System.out.println("1" + " " + n);
            }
            else{
            System.out.println("4");
            System.out.println("1" + " " + '2');
            System.out.println("1" + " " + '2');
            System.out.println("2" + " " + (n));
            System.out.println("2" + " " + (n));
            }
        }
    }
}