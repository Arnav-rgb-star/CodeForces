
import java.util.*;
public class MakeEq {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for(int m=0 ; m<t ; m++){
            int n  =in.nextInt();
            int[] a = new int[n];
            for(int i=0 ; i<n ; i++){
                a[i]=in.nextInt();
            }
            if(a.length==1){
                list.add(0);
                continue;
            }
            int first=1;
            int last=1;
            for(int i=1 ; i<n ; i++){
                if(a[i]==a[0]){
                    ++first;
                }
                else{
                    break;
                }
            }
            for(int i=a.length-2; i>=0 ; i--){
                if(a[i]==a[a.length-1]){
                    ++last;
                }
                else{
                    break;
                }
            }
            if((last==a.length || first==a.length) && a[0]==a[a.length-1]){
                list.add(0);
                continue;
            }
            if(a[0]!=a[a.length-1]){
                list.add(a.length-Math.max(first,last));
            }
            else{
                list.add(a.length - first - last);
            }
    }
        for(int m=0 ; m<t ; m++){
            System.out.println(list.get(m));
        }
    }
}
