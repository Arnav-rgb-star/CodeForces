WRONG 
import java.util.*;
import java.io.*;
public class MonocarpStr {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<Integer> ans = new ArrayList<>();

        for(int m=0;m<t;m++){
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int A=0,B=0;
            for(int i=0;i<n;i++){
                char ch = str.charAt(i);
                if(ch=='a'){
                    ++A;
                }else{
                    ++B;
                }
            }
            int diff=0;
            boolean a=false,b=false;
            if(A>B){
                a=true;
                diff=A-B;
            }
            else if(A<B){
                b=true;
                diff=B-A;
            }else{
                ans.add(0);
                continue;
            }
            int cons_a=0,cons_b=0,max_a=0,max_b=0;
            for(int i=0;i<n-1;i++){
                if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)=='a'){
                    ++cons_a;
                    max_a = Math.max(max_a,cons_a);
                }else{
                    cons_a=0;
                }
            }
            for(int i=0;i<n-1;i++){
                if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)=='b'){
                    ++cons_b;
                    max_b = Math.max(max_b,cons_b);
                }else{
                    cons_b=0;
                }
            }
            if(A!=0) ++max_a;
            if(B!=0) ++max_b;
            if(A==n || B==n){
                ans.add(-1);
            }   
            else if(a && diff<=max_a){
                ans.add(diff);
            }
            else if(a && diff>max_a){
                ans.add(-1);
            }
            else if(b && diff<=max_b){
                ans.add(diff);
            }
            else{
                ans.add(-1);
            }
        }

        for(int i=0;i<t;i++) System.out.println(ans.get(i));
    }
}
