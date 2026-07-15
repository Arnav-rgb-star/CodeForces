import java.util.*;
import java.io.*;
public class flippingGame {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int a[]=new int[n];

        int zeros[]=new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());

        zeros[0]= (a[0]==0) ? 1:0;

        for(int i=1;i<n;i++){
            zeros[i]=zeros[i-1];
            if(a[i]==0) ++zeros[i];
        }

        int max = 0;
        int s=0;
        int e=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int last = (i>0) ? zeros[i-1]:0;

                int profit = 2*(zeros[j]-last)-(j-i+1);

                if(profit>max){
                    s=i;
                    e=j;
                    max=profit;
                }
            }
        }
        int totalOnes=0;
        
        for(int i=s;i<=e;i++) a[i]=1-a[i];
        for(int i=0;i<n;i++) if(a[i]==1) ++totalOnes;

        System.out.println(totalOnes);
    }
}
