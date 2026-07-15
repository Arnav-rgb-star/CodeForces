
import java.io.*;
import java.util.*;
public class fieldsTrip {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int a[]=new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            int dist=0;
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                if(i>0 && a[i]==a[i-1]) ++dist;
            }
            int min=0;

            for(int i=0;i<n/2;i++){
                if(i>0 && a[i]!=a[n-i] && a[n-1-i]!=a[i-1] && a[i]!=a[n-i-1]){
                    int temp=a[i];
                    a[i]=a[n-i-1];
                    a[n-i-1]=temp;
                }
            }
            for(int i=0;i<n-1;i++){
                if(a[i]==a[i+1]){
                    ++min;
                }
            }
            sb.append(Math.min(dist,min)).append("\n");
        }
        System.out.println(sb);
    }
}
