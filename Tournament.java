
import java.lang.reflect.Array;
import java.util.*;
public class Tournament {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for(int i=0 ; i<t ; i++){
            int n = in.nextInt();
            int j = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n+1];

            for(int m=1 ; m<=n ; m++){
                a[m] = in.nextInt();
            }
            int ele = a[j];
            Arrays.sort(a);
            if(ele!=a[n] && k==1){
                list.add("NO");
            }
            else{
                list.add("YES");
            }
        }

        for(int m=0 ; m<t ; m++){
            System.out.println(list.get(m));
        }
    }
}
