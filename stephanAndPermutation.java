
import java.util.*;
import java.io.*;

public class stephanAndPermutation{
    static int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int t=Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());
            
        
            st = new StringTokenizer(br.readLine());
            int a[]=new int[n];
            for(int i=0;i<n;i++) a[i] = Integer.parseInt(st.nextToken());

            int g=gcd(x,y);

            boolean possible = true;

            for(int i=1;i<=n;i++){

                if((a[i-1] - i)%g != 0){
                    possible=false;
                }
            }

            if(possible) sb.append("YES\n");
            else sb.append("NO\n");
        }

        System.out.print(sb);
    }
}

