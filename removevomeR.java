
import java.io.*;
import java.util.*;
public class removevomeR {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());

            String str = br.readLine();
               
                int ch=0;

            for(int i=1;i<n;i++){
                if(str.charAt(i)!=str.charAt(i-1)) ++ch;
            }
            if(ch==1) sb.append(2).append("\n");
            else sb.append(1).append("\n");
        }

        System.out.println(sb);
    }
}
