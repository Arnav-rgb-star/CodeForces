
import java.util.*;
import java.io.*;
public class strangeBirthdayParty {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long a[] = new long[n];
        long c[] = new long[m];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) a[i]=Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<m;i++) c[i]=Long.parseLong(st.nextToken());

        long sum=0;

        Arrays.sort(a);
        for(int i=0;i<a.length/2;i++){
            long temp=a[n-1-i];
            a[n-1-i]=a[i];
            a[i]=temp;
        }

        for(int i=0;i<n;i++){
            if(i<m){
                sum+= Math.min(c[i],c[(int)a[i]-1]);
            }else{
                sum+= c[(int)a[i]-1];
            }
        }

        sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
