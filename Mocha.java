
import java.util.*;
public class Mocha {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for(int m=0 ; m<t ; m++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i=0 ; i<n ; i++){
                a[i] = in.nextInt();
            }
            int min = a[0];
            for(int i=1 ; i<n ; i++){
                min&=a[i];
            }
            list.add(min);
        }

        for(int m=0 ; m<t ; m++){
         System.out.println(list.get(m));   
        }
    }
}
