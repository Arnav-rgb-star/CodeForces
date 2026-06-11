
import java.util.*;
import java.io.*;
import java.nio.channels.Pipe.SourceChannel;
public class EraseFirstSec {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int m=t;
        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            HashMap<Character,Integer>mp = new HashMap<>();
            int ans=0;
            int count=0;

            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(mp.containsKey(ch)){
                    int freq = mp.get(ch);
                    mp.put(ch,++freq);
                }
                else{
                    mp.put(ch,1);
                    ++count;
                }
                ans+= count;
            }
            list.add(ans);
        }
        t=m;
        for(int i=0;i<t;i++) System.out.println(list.get(i));
    }
}
