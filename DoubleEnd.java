
import java.util.*;
public class DoubleEnd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> len = new LinkedList<>();
        int t = in.nextInt();
        in.nextLine();
        for(int m=0 ; m<t; m++){
            String a = in.nextLine();
            String b = in.nextLine();
            ArrayList<Character> common = new ArrayList<>();
            int maxCommon = 0;

            for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                int count = 0;
                while (i + count < a.length() && j + count < b.length() &&
                    a.charAt(i + count) == b.charAt(j + count)) {
                    count++;
                }
                if (count > maxCommon) {
                    maxCommon = count;
                }
            }
        }
        len.add(a.length() + b.length() - 2 * maxCommon);
        }

        for(int m=0 ; m<t; m++){
            System.out.println(len.get(m));   
        }
    } 
}
