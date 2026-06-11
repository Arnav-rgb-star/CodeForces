
import java.io.*;
import java.util.*;
public class nastiaAndGoodArr {
    public static int gcd(int a,int b){
        if(a==0) return b;
        else return gcd(b%a,a);
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int a[]=new int[n];
            int min= Integer.MAX_VALUE;
            int pos=-1;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                if(min>a[i]){
                    pos=i;
                    min=a[i];
                }
            }
            int odd=1;
            int even=2;
            sb.append(n-1).append("\n");
                       for(int i=0;i<n;i++){
                if(i!=pos){
                    int val = min + Math.abs(i-pos);
                    sb.append((pos+1) + " " +(i+1) + " " + min + " " + val).append("\n");
                }
            }
        }


        System.out.println(sb);
    }
}
