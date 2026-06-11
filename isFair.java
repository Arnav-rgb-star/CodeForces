import java.util.*;
public class isFair {
    public static boolean Fair(long n,long og){
    while(n!=0){
        long r = n%10;
        if(r!=0 && og%r!=0){
            return false;
        }
        else{
            n/=10;

        }
    }
        return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        ArrayList<Long> list = new ArrayList<>();
        for(int i=0;i<t;i++){
            long n=in.nextLong();
            while(!Fair(n,n)){
                n++;
            }
            list.add(n);
        }
        for(int i=0;i<t;i++){
            System.out.println(list.get(i));
        }
    }
}
