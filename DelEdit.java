
import java.util.*;
public class DelEdit {
    public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    int k = t;
    ArrayList<String> list = new ArrayList<>();

    while(t-- >0){

    String first0 = in.next();
    String second0 = in.next();
    StringBuilder first = new StringBuilder(first0);
    StringBuilder second= new StringBuilder(second0);

    int[] freq = new int[26];
    for(int i=0 ; i<second.length() ; i++){
        ++freq[second.charAt(i) - 'A'];
    }
    for(int i=first.length()-1; i>=0 ; i--){
        char ch = first.charAt(i);
        if(freq[ch-'A']>0){
            --freq[ch-'A'];
        }
        else{
            first.setCharAt(i, '0');
        }
    }
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<first.length();i++){
        char ch = first.charAt(i);
        if(ch!= '0'){
            sb.append(ch);
        }
    }
    if(sb.toString().equals(second.toString())){
        list.add("YES");
    }
    else{
        list.add("NO");
    }
    }

    for(int i=0 ; i<k ; i++){
        System.out.println(list.get(i));
    }
    }
}
