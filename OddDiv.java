import java.util.*;

public class OddDiv {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-- > 0){
            long n = in.nextLong();
            long result = n & (n-1) ;
            if( result > 0 ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
