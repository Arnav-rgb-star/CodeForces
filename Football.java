
import java.util.*;
public class Football {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            list.add(in.nextLine());
        }
        int count=1;
        int max=1;
        StringBuilder str = new StringBuilder(list.get(0));
        Collections.sort(list);
        for(int i=1 ; i<n ; i++){
            if(list.get(i).equals(list.get(i-1))){
                ++max;
            }
            else{
                max=1;
            }
            if(count<max){
                count=max;
                str.setLength(0);
                str.append(list.get(i));
            }
        }
        System.out.println(str);
    }
}
