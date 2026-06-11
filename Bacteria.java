import java.util.*;

public class Bacteria {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        long diff = -1;
        long b = t;
        int count  = 0;

        while(diff!=0){

            long m = 0;
            while( b >= (long)Math.pow(2,m)){
                ++m;
            }
            --m;
            diff = b - (long)Math.pow(2, m);
            b = diff;
            ++count;
        }
        System.out.println(count);
    }
}
