    WRONG 

import java.util.*;
import java.io.*;
public class xorTriangle {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<Long> ans = new ArrayList<>();
        
        for(int m=0;m<t;m++){
            int x = Integer.parseInt(br.readLine());
            long y=-1;
            for(long i=1;i<(x);i <<= 1){
                boolean cond1 = ((x+i) >(x^i));
                boolean cond2 = ((x+(x^i)) > i);
                boolean cond3 = ((i+(x^i)) > x);
                if(cond1 && cond2 && cond3){
                    y=i;
                    break;
                }
            }
            ans.add(y);
        }

        for(int i=0;i<t;i++) System.out.println(ans.get(i));
    }    
}
