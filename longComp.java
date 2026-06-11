import java.util.*;
public class longComp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        final double eps = 1e-9;

        while(t-->0){
            long x1 = in.nextLong();
            long p1 = in.nextLong();
            long x2 = in.nextLong();
            long p2 = in.nextLong();

            double m = (double)Math.log10(x1) + p1;
            double n = (double)Math.log10(x2) + p2;

            if(m - n >  eps){
                System.out.println(">");
            }
            else if(n - m > eps){
                System.out.println("<");
            }
            else{
                 System.out.println("=");
            }
        }
    }
}
