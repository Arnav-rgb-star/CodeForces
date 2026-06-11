import java.util.*;
public class SkiResort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        LinkedList<Long> list = new LinkedList<>();
        int t = in.nextInt();    
        
        for(int m=0 ; m<t; m++){
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int a[] = new int[n];
        for(int i=0 ; i<n ; i++){
            a[i]=in.nextInt();
        }
        int count=0;
        long sum=0;
        for(int i=0 ; i<n ; i++){
            if(a[i]<= q){
                ++count;
            }
            else{
                if(count>=k){
                long seg = (count-k+1);
                sum+= ((seg)*(seg+1))/2;
            }
                count=0;
            }
        }
            if(count>=k){
            long seg = (count-k+1);
            sum+= ((seg)*(seg+1))/2;
            }
        list.add(sum);
        }

        for(int m=0 ; m<t; m++){
            System.out.println(list.get(m));
        }
    }
}
