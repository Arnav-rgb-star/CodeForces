import java.util.*;
import java.util.Collections;
import java.util.Arrays;

public class BogoSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-->0){
            int n  = in.nextInt();
            Integer[] a = new Integer[n];
            for(int i=0 ; i<n ; i++){
                a[i]=in.nextInt();
            }

            Arrays.sort(a,Collections.reverseOrder());

            for(int i=0 ; i<a.length-1 ; i++){
                for(int j=i+1 ; j<a.length ; j++){
                    if((j - i) == (a[j]-a[i])){
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                        i=0;
                        j=1;
                    }
                }
            }
            for(int i=0 ; i<n ; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
