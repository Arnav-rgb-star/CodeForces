import java.util.*;

public class Game {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
        in.nextLine();

    while(n-- >0){
        String str = in.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int count = 0;
        for(int i=0 ; i<sb.length()-1 ; i++){
            if(sb.charAt(i) != sb.charAt(i+1)){
                ++count;
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                i=-1;
            }
        }
        if(count %2 ==0){
            System.out.println("NET");
        }
        else{
            System.out.println("DA");
        }
    }
}
}
