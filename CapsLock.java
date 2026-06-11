
import java.util.*;
public class CapsLock {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int upper=0,lower=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                ++upper;
            }
            else{
                ++lower;
            }
        }
        if(str.charAt(0)>='a' && str.charAt(0)<='z' && lower==1){
        str=str.toLowerCase();
        char first = Character.toUpperCase(str.charAt(0));
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(0, first);
        System.out.println(sb.toString());
        }
        else if(upper==str.length()){
            System.out.println(str.toLowerCase());
        }
        else{
            System.out.println(str);
        }
    }
}
