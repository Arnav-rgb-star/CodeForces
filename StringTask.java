
import java.util.*;
public class StringTask {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        StringBuilder sb = new StringBuilder();
        String str = x.toLowerCase();
        LinkedList<Character> ch = new LinkedList<>();
        ch.add('a');
        ch.add('e');
        ch.add('i');
        ch.add('o');
        ch.add('u');
        ch.add('y');
        for(int i=0 ; i<str.length() ; i++){
            if(!ch.contains(str.charAt(i))){
                sb.append(".");
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }  
}
