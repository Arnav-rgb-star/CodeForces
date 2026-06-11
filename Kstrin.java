
import java.util.*;
public class Kstrin {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        int[] freq = new int[26];
        for(int i = 0; i < str.length(); i++) {
            ++freq[str.charAt(i) - 'a'];
        }
        StringBuilder sb = new StringBuilder();
        boolean valid = true;
        for(int i = 0; i < 26; i++) {
            if(freq[i] % t != 0) {
                valid = false;
                break;
            }
        }
        if(valid) {
            for(int i = 0; i < 26; i++) {
                for(int j = 0; j < freq[i] / t; j++) {
                    sb.append((char)(i + 'a'));
                }
            }
            for(int i = 0; i < t; i++) {
                System.out.print(sb);
            }
        } else {
            System.out.println("-1");
        }
    }
}
