
import java.util.*;
import java.io.*;
public class LunaticNeverContent {

    public static int cd(int a,int b){
        while(b!=0){
            int temp = b;
            b=a% b;
            a=temp;
        }
        return a;
}
    public static void main(String[] args) throws IOException{

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());
        List<Integer> ans = new ArrayList<>();

        for(int m=0;m<t;m++){
            int n=Integer.parseInt(br.readLine());
            int[] a =new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine()); 
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            int gcd=0;
            for(int i=0;i<n/2;i++){
                int tb = Math.abs(a[i]-a[n-1-i]);
                gcd = cd(gcd,tb);
            }
            ans.add(gcd);
        }
        
        for(int m=0;m<t;m++){
            System.out.println(ans.get(m));
        }
   } 
}
