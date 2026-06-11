
import java.util.*;
public class MA {

    public static long steps(long n,long count,long og){
        if(n == 1) return count;

        else if(n%6 == 0 ) return steps(n/6,++count,og);
        else if(n % 3 == 0 ) return steps(2*n,++count,og);

        else return -1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        ArrayList<Long> list = new ArrayList<>();

        for(int i=0 ; i<t ;i++){
            long n = in.nextLong();
            long count = steps(n,0,n);
            list.add(count);
        }
        
        for(int i=0 ; i<t ;i++){
            System.out.println(list.get(i));
        }
    }
}
