import java.util.*;

public class primeDiff{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        int limit = 1000000;
        boolean[] prime = new boolean[limit+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;

        for(int i=2; (i*i)<=limit; i++){
            if(prime[i]){
            for(int j =i*i; j<=limit; j=j+i){
                    prime[j] = false;
                }
            }
        }

        while(t-- >0){
            int n = in.nextInt();
            long count = 0;

            for(int d=2 ; d<=n ; d++){
                if(prime[d])
                count+=(n-d);
            }
            System.out.println(count);
        }
    }
}