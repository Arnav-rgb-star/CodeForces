import java.util.*;

public class Cacak{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for(int i=0 ; i<t ; i++){
            long n = in.nextLong();
            long k = in.nextLong();
            long x = in.nextLong();
            long min = (k*(k+1))/2;
            long pre = (2*n +1) - k;
            long max = (k*(pre))/2;

            if(x<=max && x>=min){
                list.add("YES");
            }
            else{
                list.add("NO");
            }
        }

        for(int i=0 ; i<t ; i++){
            System.out.println(list.get(i));
        }
    }
}