
import java.io.*;
import java.util.StringTokenizer;
public class buyingShovels {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        int ans=1;

        if(n<=k) ans=1;
        else{
            for(int i=1;i*i<=n;i++){
                if(n%i==0){
                    if(i<=k) ans=Math.max(ans,i);
                    if(n/i <=k) ans=Math.max(ans,n/i);
                }
            }
            ans=n/ans;
        }
        sb.append(ans).append("\n");
        }
        System.out.println(sb);  
    }
}
