
import java.util.*;
public class ArrMerg {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for(int k=0;k<t;k++){
            int n=in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] x = new int[2*n + 1];
            int[] y = new int[2*n + 1];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=in.nextInt();
            }
            int count=1;
            for(int i=1;i<n;i++){
                if(a[i]==a[i-1]){
                    ++count;
                }
                else{
                    x[a[i-1]]=Math.max(x[a[i-1]],count);
                    count=1;
                }
                
            }
                x[a[n-1]] = Math.max(x[a[n-1]],count);
            count=1;
            for(int i=1;i<n;i++){
                if(b[i]==b[i-1]){
                    ++count;
                }
                else{
                    y[b[i-1]]=Math.max(y[b[i-1]],count);
                    count=1;
                }
            }
            y[b[n-1]] = Math.max(y[b[n-1]],count);
            
            int freq=0;
            for(int i=0;i<=(2*n);i++){
                freq = Math.max(x[i]+y[i],freq);
            }
            list.add(freq);
        }
        
        for(int k=0;k<t;k++){
            System.out.println(list.get(k));
        }
        }
}
