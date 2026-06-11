
import java.io.*;
import java.util.*;
public class zhilyBracketSwapping {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String a = br.readLine();
            String b = br.readLine();
            int l=0;
            int r=0;
            boolean can = true;
            if(a.charAt(0)==')' || b.charAt(0)==')' ||  a.charAt(n-1)=='(' || b.charAt(n-1)=='('){
                sb.append("NO").append("\n");
                continue;
            }
            int mix=0;
            for(int i=0;i<n;i++){

                if(a.charAt(i)==b.charAt(i)){
                    if(a.charAt(i)=='(') ++l;
                    else ++r;
                }else ++mix;
                
                if((l-r) <0){
                    can=false;
                    break;
                }
                if(l==r){
                    if(mix%2!=0){
                        can=false;
                        break;
                    }
                    mix=0;
                }
            }
            
            if((l-r)==0 && can) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }
}
