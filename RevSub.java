
import java.util.*;
public class RevSub {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String copy = new String(charArray);

        if(str.equals(copy)){
            System.out.println("NO");
        }
        else{
            int start = 0;
            int end = 0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) > copy.charAt(i)){
                    start = i+1;
                }
                if(str.charAt(i) < copy.charAt(i)){
                    end= i+1;
                }
                if(end > start){
                    break;
                }
            }
            System.out.println("YES");
            System.out.println(start + " " + end);
        }

    }
}
