
import java.io.*;
public class simpleSeq {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb =  new StringBuilder();
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            sb.append(n-1+ " "+ n);

            for(int i=n-2;i>=1;i--){
                sb.append(" " + i);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
