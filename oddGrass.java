import java.util.*;
public class oddGrass {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            long x = in.nextLong();
            long n = in.nextLong();

            if((x&1)==0){
                if(n % 4 ==0){
                    System.out.println(x);
                }
            else if(n % 4 ==1){
                    System.out.println(x-n);
                }
            else if(n % 4 ==2){
                    System.out.println(x+1);
                }
            else{
                    System.out.println(x+n+1);
                }
            }
            else {
                if(n % 4 ==0){
                    System.out.println(x);
                }
            else if(n % 4 ==1){
                    System.out.println(x+n);
                }
            else if(n % 4 ==2){
                    System.out.println(x-1);
                }
            else{
                    System.out.println(x-n-1);
                }
            }
        }
    }
}
