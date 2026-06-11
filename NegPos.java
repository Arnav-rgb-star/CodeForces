import java.util.*;

public class NegPos {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int m=0 ; m<t ; m++){
            int n = in.nextInt();
            ArrayList<Long> list = new ArrayList<>();

            for(int i=0 ; i<n ; i++){
                list.add(in.nextLong());
            }
            int count = 0;
            long abs_sum=0;
            for(int i=0 ; i<n ; i++){
                if(list.get(i)<0){
                    ++count;
                    abs_sum = abs_sum + -1*list.get(i);
                    list.set(i,-1*list.get(i));
                }
                else{
                    abs_sum = abs_sum + list.get(i);
                }
            }
            if(list.contains(0) || count%2==0){
                System.out.println(abs_sum);
            }else{
                Collections.sort(list);
                System.out.println(abs_sum - 2*list.get(0));
            }
        }
    }
}