import java.math.BigInteger;
import java.util.Scanner;

public class AvToBus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();  

        for (int m = 0; m < t; m++) {
            BigInteger n = in.nextBigInteger();
            BigInteger x = BigInteger.valueOf(-1);
            BigInteger y = BigInteger.valueOf(-1);
            if((n).compareTo(BigInteger.valueOf(4))< 0 || !(n).mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)){
                System.out.println(-1);
            }
            else{
                x = n.divide(BigInteger.valueOf(4));
                y =(n.add(BigInteger.valueOf(5)).divide(BigInteger.valueOf(6))); 
                System.out.println(y + " " + x);
            }
        }
        in.close();
    }
}
