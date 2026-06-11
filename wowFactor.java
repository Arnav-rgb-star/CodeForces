
import java.lang.reflect.Array;
import java.util.*;
public class wowFactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        long w=0;
        long o=0;
        ArrayList<Long> list = new ArrayList<>();
        long sum=0;
        long ans=0;
        long s=0;

        int idx=1;
        boolean found = false;

        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)==str.charAt(i) && str.charAt(i)=='v'){
                idx=i;
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println(0);
            return;
        }

        for(int i=idx;i<str.length();i++){
            if(str.charAt(i-1)==str.charAt(i) && str.charAt(i)=='v'){
                ++w;
                if(w==1 && o!=0){
                    list.add(o);
                    o=0;
                }
            }else if(str.charAt(i)=='o'){
                ++o;
                if(o==1 && w!=0){
                    list.add(w);
                    w=0;
                }
            }
        }
        if(w!=0){
            list.add(w);
        }
        if(list.size()<=1){
            System.out.println(0);
        }else{

            for(int i=0;i<list.size();i+=2){
                sum+=list.get(i);
            }

            for(int i=0;i<list.size();i++){
                if(i%2==0){
                    s+=list.get(i);
                }else{
                    long l=sum-s;
                    ans+= (s*list.get(i)*l);
                }
            }
            System.out.println(ans);
        }
    }
}
