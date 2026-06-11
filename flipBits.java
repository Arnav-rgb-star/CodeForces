
import java.util.*;
import java.io.*;

public class flipBits {

static boolean isFlip(String a,String b){

    int n = a.length(); 
    int n_ones=0,n_zeros=0;
    for(int i=0;i<n;i++){
        if(a.charAt(i)=='0') ++n_zeros;
        else ++n_ones;
    }
    boolean flip=false;
    boolean match=false;

    for(int i=n-1;i>=0;i--){
        if(flip){
            if(a.charAt(i)!=b.charAt(i)){
                match=true;
            }else{
                match=false;
                if(!match && n_ones!=n_zeros){
                    return false;
                }
                flip=false;
            }
        }else{
            if(a.charAt(i)==b.charAt(i)){
                match=true;
            }else{
                match=false;
                if(!match && n_ones!=n_zeros){
                    return false;
                }
                flip=true;
            }
        }

        if(flip){
            if(a.charAt(i)=='0') --n_ones;
            else --n_zeros;
        }else{
            if(a.charAt(i)=='1') --n_ones;
            else --n_zeros;
        }
    }

    return true;
}
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<String> ans = new ArrayList<>();

        while(t-- >0){
            int n  =Integer.parseInt(br.readLine());
            String a = br.readLine();
            String b = br.readLine();

            boolean can = isFlip(a,b);

            if(can) ans.add("YES");
            else ans.add("NO");
        }
        for(int i=0;i<ans.size();i++) System.out.println(ans.get(i));
    }
}
