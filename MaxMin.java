
import java.lang.reflect.Array;
import java.util.*;
public class MaxMin {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for(int m=0 ; m<t ; m++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i=0 ; i<n ; i++){
                a[i] = in.nextInt();
            }
            StringBuilder sb = new StringBuilder() ;
            int min[] = new int[n];
            int max[] = new int[n];
            min[0] = a[0];
            max[n-1]=a[n-1];
            for(int i=1;i<n;i++){
                min[i]=Math.min(min[i-1],a[i]);
            }
            for(int i=n-2;i>=0;i--){
                max[i]=Math.max(max[i+1],a[i]);
            }

            // for(int i=0 ; i<n ; i++){
            // System.out.print(min[i]+ " ");
            // }
            // System.out.println();
            // for(int i=0 ; i<n ; i++){
            // System.out.print(max[i]+" ");
            // }    
            // System.out.println();

            sb.append(1);
            for(int i=1 ; i<n ; i++){
                if(min[i]==a[i] || a[i]==max[i] ){
                    sb.append(1);
                }
                else{
                    sb.append(0);
                }
            }

            list.add(sb.toString());
        }
        for(int m=0 ; m<t ; m++){
            System.out.println(list.get(m));
        }
    }
}