
import java.util.*;
public class AB {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        in.nextLine();

        for(int m=0 ; m<y ; m++){
            String str = in.nextLine();
            StringBuilder sb = new StringBuilder(str);
            if(sb.charAt(0) == sb.charAt(sb.length()-1)){
                list.add(sb.toString());
            }
            else{
                if(sb.charAt(0) == 'a'){
                sb.setCharAt( 0,'b');
                }
                else{
                    sb.setCharAt( 0,'a');
                }
                list.add(sb.toString());
            }
        }
        for(int m=0 ; m<y ; m++){
            System.out.println(list.get(m));

        }
    }
}
