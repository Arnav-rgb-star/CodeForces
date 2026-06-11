import java.util.*;
public class BuyTorch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        while(t-- >0){
            long x = in.nextLong();
            long y = in.nextLong();
            long k = in.nextLong();

            long sticks = ((k*y + k-1) + x -2)/(x-1);
            System.out.println(sticks + k);
        }   
    }
}
