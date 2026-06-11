
import java.util.*;
public class SumMed {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<Long> list = new ArrayList<>();

        for(int m=0 ; m<t ; m++){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[(n*k)];

            int index = (a.length-1) - (n/2);
            int diff = (a.length - 1) - index;
            int count = k;
            long sum = 0;

            for(int i=0 ; i<a.length ; i++){
                a[i] = in.nextInt();
            }

            for(int i=a.length-1 ; i>=0 ; i--){
                if(count!=0 && index == i){
                    index-=(diff+1);
                    --count;
                    sum+=a[i];
                }
            }
            list.add(sum);
        }

        for(int m=0 ; m<t ; m++){
        System.out.println(list.get(m));    
        }
    }
}
