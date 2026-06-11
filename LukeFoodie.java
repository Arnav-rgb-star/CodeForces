
import java.util.*;
public class LukeFoodie {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();

    LinkedList<Integer> list = new LinkedList<>();
    
    for(int k=0;k<t;k++){
        int n=in.nextInt();
        int x=in.nextInt();
        int[] a=new int[n];
        int[] left = new int[n];
        int[] right = new int[n];

        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
            left[i] = a[i]-x;
            right[i] = a[i]+x;
        }
        int l=left[0];
        int r=right[0];
        int count=0;

        for(int i=1;i<n;i++){
            l=Math.max(l,left[i]);
            r=Math.min(r,right[i]);
            if(l>r){
                ++count;
                l=left[i];
                r=right[i];
            }
        }
        list.add(count);

    }

    for(int k=0;k<t;k++){
        System.out.println(list.get(k));
    }

  }
}
