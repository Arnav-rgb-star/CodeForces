
import java.util.*;
public class OnlyOneDigit {

    public static long getMin(long n){
    long dig=100000000L;
    while(n!=0){
        if(dig > n%10){
            dig = n%10;
        }
        n/=10;
    }    
        return dig;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        LinkedList<Long> list = new LinkedList<>();
        int t =in.nextInt();
        for(int i=0 ;i<t ; i++){
        long n = in.nextLong();
        long min = getMin(n);
        list.add(min);
        }

       for(int i=0 ;i<t ; i++){
        System.out.println(list.get(i));
        }
    }
}
