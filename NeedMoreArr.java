
import java.util.*;
public class NeedMoreArr {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        List<Integer> list = new LinkedList<>();
        for(int m=0;m<t;m++){
            int n=in.nextInt();
            List<Integer> a = new ArrayList<>();
            for(int i=0;i<n;i++){
                a.add(in.nextInt());
            }
            int count=0,prev=-1;
            for(int i=0;i<a.size();i++){
                if(a.get(i) > prev+1){
                    ++count;
                    prev=a.get(i);
                }
            }
            list.add(count);
        }

        for(int m=0;m<t;m++){
            System.out.println(list.get(m));
        }
    }
}
