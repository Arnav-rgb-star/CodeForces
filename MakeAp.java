import java.util.*;
public class MakeAp{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0 ; i<t ; i++){

        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        long x = (2*b - c);
        long y = (a + c)/2;
        long z = (2*b - a);
        
        if(a==1 && b == 1){
            long mid = 1 + c;
            if(mid % 2 ==-0){
                list.add("YES");
            }
            else{
                list.add("NO");
            }
            continue;
        }

        if((y % b ==0 && (a + c)%2==0) && y>0){
            list.add("YES");
        }
        else if(x % a ==0 && x>0 ){
            list.add("YES");
        }
        else if(z % c ==0 && z>0){
            list.add("YES");
        }
        else{
            list.add("NO");
        }
        }

        for(int i=0 ; i<t ; i++){
            System.out.println(list.get(i));
        }
}
}