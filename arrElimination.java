
import java.io.*;
import java.util.*;

public class arrElimination {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a[]=new int[n];
            int bits[]=new int[31];

            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());

            for(int i=0;i<n;i++){
                String bin = Integer.toBinaryString(a[i]);
                for(int j=bin.length()-1;j>=0;j--){
                    if(bin.charAt(j)=='1') ++bits[bin.length()-1-j];
                }
            }
            int k=1;
            sb.append(k);
            
            for(k=2;k<=n;k++){
                boolean can = true;
                for(int j=0;j<31;j++){
                    if((bits[j]%k) !=0){
                        can=false;
                        break;
                    }
                }
                if(can) sb.append(" " + k);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }    
}
