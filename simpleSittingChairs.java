
import java.io.*;
import java.util.*;
public class simpleSittingChairs {
    public static void main(String[] args) throws IOException{
        
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        while(k-->0){
            int n  =Integer.parseInt(br.readLine());
            StringTokenizer str = new StringTokenizer(br.readLine());
            
            int a[]= new int[n];

            for(int i=0;i<n;i++) a[i]=Integer.parseInt(str.nextToken());
            int ans=0;

            for(int i=0;i<n;i++){
                if((i+1)>=a[i]) ++ans;
            }
            sb.append(ans).append("\n");
        }

        System.out.println(sb);
    }
}
