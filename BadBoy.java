
import java.util.*;
public class BadBoy {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int t = in.nextInt();

        for(int i=0 ; i<t ; i++){
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            ArrayList<Integer> internal = new ArrayList<>();
            list.add(internal);
                list.get(i).add(1);
                list.get(i).add(1);
                list.get(i).add(n);
                list.get(i).add(m);
        }

        for(int i=0 ; i<t ; i++){
            System.out.println(list.get(i).get(0) + " " + list.get(i).get(1) + " " + list.get(i).get(2) + " " + list.get(i).get(3));
        }
    }
}
