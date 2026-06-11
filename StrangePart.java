
import java.lang.reflect.Array;
import java.util.*;
public class StrangePart {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<ArrayList<Long>> list = new ArrayList<>();

        for(int m=0 ; m<t ; m++){
            int n = in.nextInt();
            long x = in.nextLong();

            ArrayList<Long> row = new ArrayList<>();
            list.add(row);

            long[] a = new long[n];
            long sum = 0;
            for(int i=0 ; i<n ; i++){
                a[i] = in.nextLong();
                sum+= a[i];
            }
            long min = ((sum + x) - 1)/x;
            long max = 0;
            for(int i=0 ; i<n ; i++){
                max += ((a[i] + x) - 1)/x;
            }
            list.get(m).add(min);
            list.get(m).add(max);
        }

        for(int i=0 ; i<t ; i++){
            System.out.println(list.get(i).get(0) + " " + list.get(i).get(1));
        }
    }
}
