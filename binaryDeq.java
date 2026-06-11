

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
public class binaryDeq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int m=0;m<t;m++){
            int n=in.nextInt();
            int s = in.nextInt();
            int []a= new int[n];
            int sum=0;

            for(int i=0;i<n;i++){
            a[i]=in.nextInt();
            sum+=a[i];
            }
            if(sum<s){
                list.add(-1);
                continue;
            }
            if(sum==s){
                list.add(0);
                continue;
            }
            
            int ops=0;
            int i=0;
            int j=0;
            int len=-1;
            int cS=0;

            while(j<n){
                cS+=a[j];
                while(cS>s){
                    cS-=a[i];
                    ++i;
                }
                if(cS==s){
                    len=Math.max(len,j-i+1);
                }
                ++j;
            }
            if(len==-1) ops=-1;
            else ops= n-len;

            list.add(ops);

            System.out.println();
        }

        for(int i=0;i<t;i++){
            System.out.println(list.get(i));
        }
    }
}
