
import java.util.*;
public class B {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<String> strings = new ArrayList<>();
        in.nextLine();
        for(int m=0;m<t;m++){
            
            String str = in.nextLine();
            Stack<Integer> upper = new Stack<>();
            Stack<Integer> lower = new Stack<>();
 
            for(int i=0 ; i<str.length() ; i++){
                char ch = str.charAt(i);
                if(ch=='B' && !upper.isEmpty()){
                    upper.pop();
                }
                else if(ch=='b' && !lower.isEmpty()){
                    lower.pop();
                }
                else if(ch>='A' && ch<='Z' && ch!='B'){
                    upper.push(i);
                }
                else if(ch>='a' && ch<='z' && ch!='b'){
                    lower.push(i);
                }
            }
 
            ArrayList<Integer> merge = new ArrayList<>();
            while(!upper.isEmpty()){
                merge.add(upper.pop());
            }
            while(!lower.isEmpty()){
                merge.add(lower.pop());
            }
 
            Collections.sort(merge);
 
            StringBuilder p = new StringBuilder();
            for(int i=0 ; i<merge.size() ; i++){
 
                p.append(str.charAt(merge.get(i)));
            }
            strings.add(p.toString());
        }
 
        for(int m=0;m<t;m++){
            System.out.println(strings.get(m));
        }
    } 
}