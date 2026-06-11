
import java.util.*;
import java.io.*;
public class BalancedStr {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<String> ans = new ArrayList<>();

        for(int m=0;m<t;m++){
            String str = br.readLine();

            StringBuilder sb = new StringBuilder(str);
            HashMap<Character,Integer> map = new HashMap<>();

            int n = sb.length();
            int len =0;
            boolean bool = true;
            boolean periodic = true;
            for(int i=0;i<n;i++){
                char ch = sb.charAt(i);
                if(!map.containsKey(ch) && periodic){
                    map.put(ch,1);
                    ++len;
                    
                }
                else{
                    periodic =false;
                    int idx = (i-len);
                    if(sb.charAt(idx)==sb.charAt(i)){
                        bool = true;
                    }
                    else{
                        bool = false;
                        break;
                    }
                }
            }
            if(bool){
                ans.add("YES");
            }
            else{
                ans.add("NO");
            }
            
        }
        for(int i=0;i<t;i++) System.out.println(ans.get(i));
    }
}
