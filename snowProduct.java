
import java.io.*;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.StringTokenizer;
public class snowProduct {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n= Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a[]=new int[n];
            int b[]=new int[n];
            int c[]=new int[n];
            HashMap<Integer,Long> freq = new HashMap<>();
            long pairs1=0,pairs2=0;

            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++) b[i]=Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++) c[i]=Integer.parseInt(st.nextToken());

            for(int shift=0;shift<n;shift++){
                boolean can=true;
                for(int i=0;i<n;i++){
                    if(a[i]>=b[(i+shift)%n]){
                        can=false;
                        break;
                    }
                }
                if(can) ++pairs1;
            }
            for(int shift=0;shift<n;shift++){
                boolean can=true;
                for(int i=0;i<n;i++){
                    if(b[i]>=c[(i+shift)%n]){
                        can=false;
                        break;
                    }
                }
                if(can) ++pairs2;
            }
            sb.append(pairs1*pairs2*n).append("\n");
        }
        System.out.println(sb);
    }
}
