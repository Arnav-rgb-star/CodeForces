
import java.util.*;
import java.io.*;
 public class PalindromeGame {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<String> ans = new ArrayList<>();

        for(int m=0;m<t;m++){
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            StringBuilder sb = new StringBuilder(str);
            int zeros=0;

            for(int i=0;i<n;i++){
            if(sb.charAt(i)=='0') 
                ++zeros;
            }
            if(zeros%2==0 || zeros==1){
                ans.add("BOB");
            }
            else{
                ans.add("ALICE");
            }
        }
        for(int i=0;i<t;i++) System.out.println(ans.get(i));
    }
}
