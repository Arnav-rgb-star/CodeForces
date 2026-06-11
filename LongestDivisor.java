
import java.util.*;
public class LongestDivisor {

    public static long nextPrime(long n){
            for(long i=n;;i++){
                boolean isPrime = true;
                for(long j=2; j*j<=i ; j++){
                    if(i%j==0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    return i;
                }
            }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Long> vec = new Vector<>();
        for(int m=0;m<t;m++){
            long d = in.nextLong();
            long p = nextPrime(d+1);
            long q = nextPrime(d+p);
            vec.add(Math.min((p*p*p),(p*q)));

        }
        for(int m=0;m<t;m++){
            System.out.println(vec.get(m));   
        }
    }
}
