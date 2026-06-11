import java.util.*;
public class Mainak{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int m=0 ; m<t ; m++){
            int n=in.nextInt();
            int[] a = new int[n];

            for(int i=0 ; i<n ; i++){
                a[i]=in.nextInt();
            }
            int x,y,z;
            x = y = z = 0;
            for(int i=1;i<n;i++){
                x=Math.max(x,a[i]-a[0]);
            }
            for(int i=0;i<n-1;i++){
                y=Math.max(y,a[n-1]-a[i]);
            }
            for(int i=1;i<n;i++){
                z=Math.max(z,a[i-1]-a[i]);
            }

            list.add(Math.max(Math.max(x,y),z));
        }
        for(int m=0 ; m<t ; m++){
            System.out.println(list.get(m));
        }
    }
}