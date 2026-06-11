
import java.util.*;
public class Helmets {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Long> list = new ArrayList<>();
        for(int m=0 ; m<t ; m++){
            long n = in.nextLong();
            long p = in.nextLong();
            long cost=0;

            ArrayList<long[]> pairs = new ArrayList<>();
            for(int i=0 ; i<n ;i++){
                pairs.add(new long[2]);
            }
            for(int i=0 ;i<n;i++){
                pairs.get(i)[0]=in.nextLong();
            }
            for(int i=0 ;i<n;i++){
                pairs.get(i)[1]=in.nextLong();
            }

            pairs.sort(Comparator.comparingLong(x->x[1]));

            int count=0,people=0;
            ++people;
            cost+=(p);
            for(int i=0;i<n;i++){
                if(pairs.get(i)[1] < p){
                    ++count;
                }
            }
            if(count==0){
                cost = (n*p);
            }
            else{
                int i=0;
                while(count!=0 && i<n){
                    cost += (pairs.get(i)[0]) * pairs.get(i)[1];
                    people+=(pairs.get(i)[0]);
                    if(people > n){
                       cost -= ((people - n)) * pairs.get(i)[1];
                        break;
                    }
                    ++i;
                    --count;
                }
                if(people<n){
                    cost += (n - people) * p;
                }
            }
            list.add(cost);
        }

        for(int m=0 ; m<t ; m++){
            System.out.println(list.get(m));
        }
    }
}
