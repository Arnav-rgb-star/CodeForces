
import java.util.*;
import java.io.*;

public class sameDiff {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            long []a= new long[n+1];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++) a[i]=Long.parseLong(st.nextToken());
            long diff[] = new long[n];

            for(int i=0;i<n;i++) diff[i]=a[i]-(i+1);
            Arrays.sort(diff);

            long same=0;
            long count=0;

            for(int i=1;i<n;i++){
                if(diff[i]==diff[i-1]){
                    ++same;
                }else{
                    count+= (same*(same+1))/2;
                    same=0;
                }
            }
            if(same!=0) count+= (same*(same+1))/2;
            
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
