
import java.util.*;
public class BB {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for(int i=0 ; i<t ; i++){
            int n = in.nextInt();
            if(n%4==0){
                list.add("BOB");
            }
            else{
                list.add("ALICE");
            }
        }

        for(int m=0 ; m<t ; m++){
            System.out.println(list.get(m));
        }
    }
}
