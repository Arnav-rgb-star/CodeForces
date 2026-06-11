
import java.util.*;

public class Div {

    static int div1(StringBuilder sb , int count){

        if(sb.length()==0) return count;
        long n = Long.parseLong(sb.toString());

        if(n % 25 == 0 ) return count;

        else if((n%10 == 5 || n%10==0)){
            if(sb.length() >= 2 && sb.charAt(sb.length() - 2)!= '0'){
            sb.deleteCharAt(sb.length()-2);
            }
            else{
            sb.deleteCharAt(sb.length()-1);
            }
            return div1(sb,++count);
        }
        else{
            sb.deleteCharAt(sb.length()-1);
            return div1(sb,++count);
        } 
    }
        static int div2(StringBuilder sb , int count){

        if(sb.length()==0) return count;
        long n = Long.parseLong(sb.toString());

        if(n % 25 == 0 ) return count;

        else if((n%10 == 5 || n%10==0)){
            if(sb.length() >= 2 && sb.charAt(sb.length() - 2)!= '5'){
            sb.deleteCharAt(sb.length()-2);
            }
            else{
            sb.deleteCharAt(sb.length()-1);
            }
            return div2(sb,++count);
        }
        else{
            sb.deleteCharAt(sb.length()-1);
            return div2(sb,++count);
        } 
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i<t ; i++){
            long n = in.nextLong();
            StringBuilder sb = new StringBuilder(String.valueOf(n));
            StringBuilder str = new StringBuilder(String.valueOf(n));
            int count = Math.min(div1(sb,0),div2(str,0));
            list.add(count);
        }

        for(int i=0 ; i<t ; i++){
            System.out.println(list.get(i));
        }
    }
}
