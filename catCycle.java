
import java.util.*;
import java.io.*;
public class catCycle {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            if((n&1)==0){
                int pos=k%n;
                if(pos==0) pos=n;

                sb.append(pos).append("\n");
            }else{
                int mid = (n+1)/2;
                int g = (k-1)/(mid-1);
                int pos = (k+g)%n;
                if(pos==0) pos=n;

                sb.append(pos).append("\n");
                
            }
        }

        System.out.println(sb);
    }
}
