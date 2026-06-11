import java.util.*;
public class AncientJohn {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];

        for(int i=0 ; i<t ; i++){
            long a = in.nextLong();
            long b = in.nextLong();

            long m = a;
            long n = b;
            while(n%2==0){
                n = n/2;
            }
            while(m%2==0){
                m = m/2;
            }
            int power_a = (int)(((Math.log(a/m)))/(Math.log(2)));
            int power_b = (int)(((Math.log(b/n)))/(Math.log(2)));

            if(m!=n){
                arr[i] = -1;
            }
            else{
                arr[i] = (Math.abs(power_a - power_b) + 2)/3;
            }

        }
        for(int i=0 ; i<t ; i++){
         System.out.println(arr[i]);   
        }
    }
}