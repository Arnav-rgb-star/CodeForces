
import java.util.*;
public class LongInt {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        
        for(int m=0 ; m<t ; m++){
            long n = in.nextLong();
            int i=1;
            while(n%i==0){
                ++i;
            }
            list.add(--i);
        }
        for(int m=0 ; m<t ; m++){
            System.out.println(list.get(m));
        }
    }
}
