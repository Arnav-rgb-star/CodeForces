
import java.util.*;
public class BalanceRound {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int m=0 ; m<t ; m++){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for(int i=0 ; i<n ; i++){
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            int max = 1;
            int count = 1;

            for(int i=0 ; i<n-1 ; i++){
                if((a[i+1] - a[i]) <= k){
                    ++count;
                if(max < count){
                    max = count;
                }
                }
                else{
                    count = 1;
                }
            }
            list.add(a.length-max);

        }
        for(int m=0 ; m<t ; m++){
            System.out.println(list.get(m));
        }
    }
}
