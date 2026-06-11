
import java.util.*;

public class MinimimLCM {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int i=0 ; i<t ; i++){

            int n = in.nextInt();
            int x=1 , y=n-1;

            for(int k = 2 ; k*k <= n ; k++){
                
                if(n%k ==0){
                    x = n / k;
                    y = n - x;
                    break;
                }
            }
                System.out.println(x + " " + y);
        }
    }
}
