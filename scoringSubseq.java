
import java.io.*;
import java.util.StringTokenizer;
public class scoringSubseq {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int a[]=new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());

            for(int i=0;i<n;i++){
                int l=1;
                int r=i+1;
                while(l<=r){
                    int m = l + (r-l)/2;
                    if(a[i+1-m]>=m){
                        l=m+1;
                    }else{
                        r=m-1;
                    }
                }
                sb.append(r + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
