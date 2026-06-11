

import java.util.*;
import java.io.*;

public class avgSleep {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long a[] = new long[n+1];

        for(int i=1;i<=n;i++) a[i]=sc.nextInt();
        double avg=0;
        double l = n-k+1;
        int count=0;

        for(int i=1;i<=n;i++){
            if(i<=(n-k+1) || i<=k){
                count++;
                if(count>(n-k+1) || count>k){
                    count=Math.min(n-k+1,k);
                }
            }else{
                count--;          
            }
            avg+= ((double)a[i]) *count;
        }
        double d = avg/l;
        System.out.printf("%.10f%n",d);
    }    
}
