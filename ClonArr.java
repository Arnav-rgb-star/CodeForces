
import java.util.*;
public class ClonArr {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int k=0 ; k<t; k++){
        int n = in.nextInt();
        int[] a = new int[n];
        
        for(int i=0 ; i<n ; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int max=1,og_count=1;

        for(int i=0 ; i<a.length-1 ; i++){
            if(a[i]==a[i+1]){
                ++og_count;
            }
            else{
                og_count=1;
            }
            if(max < og_count){
                max = og_count;
            }
        }   

        og_count = max;
        int count = max;
        int ops = 0;


        while(og_count < a.length){

            ++ops;

            count = og_count;
            og_count += count;

            if(a.length >= 2*count){
                ops += count;
            }
            else{
                 ops += Math.abs(a.length - count);
             }
        }
        list.add(ops);

        }

        for(int k=0 ; k<t; k++){
            System.out.println(list.get(k));
        }
    }
}
