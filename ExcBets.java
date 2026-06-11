
import java.util.*;
public class ExcBets {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        ArrayList<ArrayList<Long>> list = new ArrayList<>();

        for(int i=0 ; i<t ; i++){
            long a = in.nextLong();
            long b = in.nextLong();
            
            list.add(new ArrayList<Long>());

            if(a==b){
                list.get(i).add(0L);
                list.get(i).add(0L);
                continue; 
            }

            long k = Math.abs(a - b) - (a % Math.abs(a - b));
            long m = Math.abs(a - b); 
            list.get(i).add(m);

            if(a!=b && ((a % Math.abs(a - b)) != 0) && k <= (m/2)){
            list.get(i).add(k);
            }
            else {
                list.get(i).add(Math.abs(m - k));
            }

        }

        for(int i=0 ; i<t ; i++){
            System.out.println(list.get(i).get(0) + " " + list.get(i).get(1));
        }
    }
}
