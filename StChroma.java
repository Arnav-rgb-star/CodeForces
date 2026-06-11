
import java.util.*;
public class StChroma {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int n = in.nextInt();
            int x = in.nextInt();
            for(int i=0 ; i<n ; i++){
                if(i!=x)
                System.out.print(i + " ");
            }
            if(x!=n)
            System.out.print(x);
            System.out.println();
        }

    }
}
