
import java.util.*;
public class NotPalin {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        int t =in.nextInt();

        for(int j=0;j<t;j++){
            int n=in.nextInt();
            int k =in.nextInt();
            in.nextLine();
            String str = in.nextLine();

            int x=0,y=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='1'){
                    ++x;
                }
                else{
                    ++y;
                }
            }
            int min_GP,max_GP;
            min_GP =  Math.max(x,y)-(n/2);
            max_GP = (x/2)+(y/2);
            if(k>=min_GP && k<=max_GP && (k%2 == min_GP%2)){
                list.add("YES");
            }
            else{
                list.add("NO");
            }
            
        }
        for(int j=0;j<t;j++){
            System.out.println(list.get(j));
        }

    }
}
