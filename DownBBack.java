
import java.util.*;
public class DownBBack {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        in.nextLine();

        for(int i=0 ; i<t ; i++){
            int count = 0;
            boolean action = false;

            String str = in.nextLine();
            for(int j=1 ; j<str.length() -1 ; j++){
                if(str.charAt(j) == '('){
                    ++count;
                }else{
                    --count;
                }
                if(count<0){
                    list.add("YES");
                    action = true;
                    break;
                }
            }
            if(!action){
            if(count==0){
            list.add("NO");
            }
            else{
                list.add("YES");
            }
        }
    }
        for(int i=0 ; i<t ; i++){
            System.out.println(list.get(i));
        }
    }
}
