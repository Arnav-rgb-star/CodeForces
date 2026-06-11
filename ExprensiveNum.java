import java.util.*;
public class ExprensiveNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        int t = in.nextInt();
        in.nextLine();
        for(int i=0 ; i<t ; i++){
            String n = in.nextLine();
            StringBuilder sb = new StringBuilder(n);
            int min = sb.length()-1;
            int j = sb.length()-1;
            while( sb.charAt(j) == '0'){
                sb.deleteCharAt(j);
                --j;
            }
            j=sb.length()-1;
            int zeros=0; 
            while(sb.length()!=0 && j>0){
                sb.deleteCharAt(j);
                --j;
                if(sb.charAt(j)=='0'){
                    ++zeros;
                }
            }
            list.add(String.valueOf(min - zeros));
            
        }

        for(int i=0 ; i<t ; i++){
            System.out.println(list.get(i));
        }
    }
}
