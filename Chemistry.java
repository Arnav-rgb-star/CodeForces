
import java.util.*;
public class Chemistry{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-- >0){
            int n = in.nextInt();
            int k = in.nextInt();
            in.nextLine();
            String str = in.nextLine();
            int[] count = new int[26];

            for(int i=0 ; i<str.length() ; i++){
                char ch = str.charAt(i);
                ++count[ch - 'a'];
            }
            int freq = 0;
            for(int i=0 ; i<26 ; i++){
                if(count[i] % 2 == 1){
                    ++freq;
                }
            }
            if(freq - k <= 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
