import java.io.*;
import java.util.*;

public class tape{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m =in.nextInt();
        int k = in.nextInt();

        int b[]=new int[n];
        int gaps[]=new int[n-1];

        for(int i=0;i<n;i++) b[i]=in.nextInt();
        int tl = b[n-1]-b[0]+1;
        for(int i=0;i<(n-1);i++) gaps[i]=b[i+1]-b[i]-1;
        int splits=k-1;

        Arrays.sort(gaps);
        for(int i=n-2;i>=0;i--){
            if(splits>0){
                tl-=gaps[i];
                --splits;
            }else break;
        }
        System.out.println(tl);
    }
}