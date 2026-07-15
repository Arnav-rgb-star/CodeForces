
import java.io.*;
import java.util.*;
public class drawings{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();

            int max=0;
            int c=0;
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='#'){
                    ++c;
                    max = Math.max(max,c);
                }else c=0;
            }
            sb.append((max+1)/2).append("\n");
        }

        System.out.println(sb);
    }
}
