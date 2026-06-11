
import java.util.*;
public class AddAndDiv {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i<t ; i++){
        
        int a = in.nextInt();
        int b = in.nextInt();
        int mincount=Integer.MAX_VALUE;
        int start = (b==1)?1:0;

        for(int j=start ; j<=50 ; j++){
        int x = b+j;
        int y = a;
        int count=j;

        while(y!=0){
            y/=x;
            ++count;
        }

        mincount=Math.min(count,mincount);
        }

        list.add(mincount);
        }

        for(int i=0 ; i<t ; i++){
            System.out.println(list.get(i));
        }
    }
}


