
import java.util.*;
public class B_og {
static void delete_upper(ArrayList<Integer> B, ArrayList<Integer> upper){
        int i=B.size()-1;
        int j=upper.size()-1;
        while(i>=0 && j>=0){
            if(upper.get(j)!=-1 && upper.get(j) < B.get(i)){
                upper.set(j,-1);
                --i;
                --j;
            }
            else{
                --j;
            }
        }
        return ;
    }
        static void delete_lower(ArrayList<Integer> b, ArrayList<Integer> lower){
        int i=b.size()-1;
        int j=lower.size()-1;
        while(i>=0 && j>=0){
            if( lower.get(j)!=-1 && lower.get(j) < b.get(i) ){
                lower.set(j,-1);
                --i;
                --j;
            }
            else{
                --j;
            }
        }
        return ;
    }
 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<String> strings = new ArrayList<>();
        in.nextLine();
        for(int m=0;m<t;m++){
            
            String str = in.nextLine();
            ArrayList<Integer> lower = new ArrayList<>();
            ArrayList<Integer> upper = new ArrayList<>();
            ArrayList<Integer> B = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            for(int i=0 ; i<str.length() ; i++){
                char ch = str.charAt(i);
                if(ch=='B'){
                    B.add(i);
                }
                else if(ch=='b'){
                    b.add(i);
                }
                else if(ch>='A' && ch<='Z' && ch!='B'){
                    upper.add(i);
                }
                else if(ch>='a' && ch<='z' && ch!='b'){
                    lower.add(i);
                }
            }
            delete_upper(B, upper);
            delete_lower(b, lower);
 
            ArrayList<Integer> merge = new ArrayList<>();
            merge.addAll(upper);
            merge.addAll(lower);
            Collections.sort(merge);
            ArrayList<Integer> rem = new ArrayList<>();
            rem.add(-1);
            StringBuilder p = new StringBuilder(); 
            for(int i=0 ; i<merge.size() ; i++){
                if(merge.get(i)!= -1)
                p.append(str.charAt(merge.get(i)));
            }
            strings.add(p.toString());
        }
 
        for(int m=0;m<t;m++){
            System.out.println(strings.get(m));
        }
    } 
}
