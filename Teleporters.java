
import java.lang.reflect.Array;
import java.util.*;
public class Teleporters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        LinkedList<Integer> list= new LinkedList<>();

        for(int k=0;k<t;k++){
        int n=in.nextInt();
        int c=in.nextInt();
        int[] a= new int[n];

        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        long[] sum = new long[n];
        for(int i=0;i<n;i++){
            sum[i] = a[i]+i+1;
        }
        Arrays.sort(sum);
        int Teleporters=0;
        
        for(int i=0;i<n && c>0;i++){
        c-=sum[i];
        if(c>=0){
        ++Teleporters;
        }    
        }
        list.add(Teleporters);
        }

        for(int k=0;k<t;k++){
            System.out.println(list.get(k));
        }

    }
}
