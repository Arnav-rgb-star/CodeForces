
import java.io.*;
import java.util.Scanner;
public class bingoCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int t=in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int [][] a = new int[n][n];
            int freq[] = new int[n*n+1];

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j]=in.nextInt();
                    freq[a[i][j]]++;
                }
            }
            int max=0;
            for(int i=1;i<=freq.length-1;i++){
                max=Math.max(max,freq[i]);
            }
            if(max>(n*(n-1))) sb.append("NO").append("\n");
            else sb.append("YES").append("\n");
        }
        System.out.println(sb);
    }
}
