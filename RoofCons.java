
import java.util.*;
public class RoofCons {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int n=in.nextInt();
            --n;
            while((n&(n-1))!=0){
                System.out.print(n + " ");
                --n;
            }
            System.out.print(n + " ");
            for(int i=0; i<n ; i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
