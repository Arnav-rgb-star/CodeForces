

import java.io.*;
import java.util.*;
public class PapyrusPuzzle {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int a[]=new int[n];

            int b[]=new int[n];
            boolean reorder=false;
            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) b[i]=Integer.parseInt(st.nextToken());
            boolean possible=true;
            int min=0;

            for(int i=0;i<n;i++){
                if(a[i]<b[i]){
                    reorder = true;
                    break;
                }
            }
            if(!reorder){
                for(int i=0;i<n;i++) min+= a[i]-b[i];
                sb.append(min+"\n");
                continue;
            }
            min=c;
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0;i<n;i++){
                if(a[i]<b[i]){
                    possible=false;
                    break;
                }else{
                    min+= (a[i]-b[i]);
                }
            }
            if(!possible){
                sb.append(-1).append("\n");
                continue;
            }
            sb.append(min).append("\n");
        }

        System.out.println(sb);
    }
}
