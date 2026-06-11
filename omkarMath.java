
import java.io.*;
public class omkarMath {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            int m=0;
            int n=Integer.parseInt(br.readLine());
            if(n%2==0) sb.append(n/2 + " " +n/2).append("\n");
            else{
                for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    m=i; 
                    break;
                }
            }
            if(m==0) sb.append(1 + " " +(n-1)).append("\n");
            else sb.append(n/m + " " +(n-(n/m))).append("\n");
        }
        }
        System.out.println(sb);
    }
}
