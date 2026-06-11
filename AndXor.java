
import java.util.*;
public class AndXor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        LinkedList<Long> list = new LinkedList<>();

        for(int i=0 ; i<t ; i++){

            int a = in.nextInt();
            int b = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            long cost = 0;

            if((a % 2 == 1 ) && b==(a-1)){
                cost = y;
                list.add(cost);
                continue;
            }

            else if((a > b) ){
                list.add(-1L);
                continue;
            }
            
            while(a!=b){
                if((a & 1) == 0 && x > y){
                    cost+=y;
                    a^=1;
                }
                else{
                    cost+=x;
                    a+=1;
                }
            }
            list.add(cost);
        }

        for(int i=0 ; i<t ; i++){
        System.out.println(list.get(i));    
        }
    }
}
