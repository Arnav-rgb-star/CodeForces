
import java.util.*;
public class XorSeq {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        LinkedList<Long> list = new LinkedList<>();
        for(int m=0;m<t;m++){
            long x=in.nextLong();
            long y=in.nextLong();
            String a = Long.toBinaryString(x);
            String b = Long.toBinaryString(y);

            long bits=0;
            int max = Math.max(a.length(),b.length());
            while(a.length()>b.length()){
            b = '0' + b;
            }
            while(a.length()<b.length()){
            a = '0' + a;
            }


            int i = a.length()-1;

            while(i>=0 ){
                if(a.charAt(i) == b.charAt(i)){
                    ++bits;
                    --i;
                }
                else{
                    break;
                }
            }
            list.add((long)Math.pow(2,bits));
        }
        for(int m=0;m<t;m++){
            System.out.println(list.get(m));
        }
    }
}