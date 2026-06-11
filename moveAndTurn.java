
import java.util.*;
public class moveAndTurn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long ans=n/2L;
        
        if(n%2==0) System.out.println((ans+1)*(ans+1));
        else System.out.println(2*(ans+2)*(ans+1));
    }
}
