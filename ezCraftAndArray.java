
import java.io.*;
import java.util.*;
public class ezCraftAndArray{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            if(n==1) sb.append(1).append("\n");
            if(n==2) sb.append(-1).append("\n");

            if(n>=3){
                sb.append('1' + " " + '2' + " ");
                long sum=3;
                for(int i=3;i<=n;i++){
                    sb.append(sum + " ");
                    sum*=2;
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
