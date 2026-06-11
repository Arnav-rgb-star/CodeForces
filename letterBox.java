import java.util.*;
public class letterBox {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int s = in.nextInt();
            int[] a = new int[n+1];
            for(int i=0 ; i<n ; i++){
                a[i] = in.nextInt();
            }
            a[n] = s;
            Arrays.sort(a);
            int start = a[0];
            int end = a[a.length - 1];
            int count = 0;
            int mid = start + (end-start)/2;
            if(s<=mid){
                count = (s + end -2) - 2*(a[0]-1);
            }
            else{
                count = 2*(end - s) + (s-1) - (a[0]-1);
            }
            System.out.println(count);
        }
    }
}
