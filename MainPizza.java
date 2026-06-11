
import java.util.*;
public class MainPizza{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            long n = sc.nextLong();
            long rem=n;
            long hao=0;
            while(rem>2){
                long m1 = rem/3;
                hao+= m1;
                rem = rem-2*m1;
            }
            System.out.println(hao);
        }
    }
}
