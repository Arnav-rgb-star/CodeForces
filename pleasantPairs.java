
import java.util.*;
import java.io.*;

public class pleasantPairs {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb  = new StringBuilder();
        
        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int [] a = new int[n+1];
            for(int i=1;i<=n;i++) a[i]=Integer.parseInt(st.nextToken());
            int count=0;

            for(int i=1;i<=n;i++){
                for(int j=a[i]-i;j<=n;j+=a[i]){
                    if(j>i){
                        int req = (i+j)/a[i];
                        if(a[j]==req){
                            ++count;
                        }
                    }
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
