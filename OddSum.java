import java.util.*;

public class OddSum {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();

    while(t-- >0){
    long n = in.nextLong();
    long k = in.nextLong();

    if((k*k) > n){
        System.out.println("NO");
    }
    else if((k%2)!=(n%2)){
        System.out.println("NO");
    }
    else{
        System.out.println("YES");
    }
    }
    } 
}
