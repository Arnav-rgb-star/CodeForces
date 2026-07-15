

import java.io.*;
import java.util.*;
public class CTS{
    public static void main(String[] args){
        StringBuilder str=new StringBuilder();
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while(t-->0){
            int n=in.nextInt();
            long a=0;

            for(int i=1;i<=n;i++){
                long cnt=n/i;

                a+=cnt*cnt;
            }
            str.append(a).append('\n');
        }

        System.out.print(str);
    }
}