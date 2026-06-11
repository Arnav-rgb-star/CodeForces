
import java.util.*;
import java.io.*;

public class AndSort {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t= Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int m=0;m<t;m++){
            
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int [] a = new int[n];

            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());

            List<Integer> and = new ArrayList<>();
            
            for(int i=0;i<n;i++){
                if(a[i]!=i){
                   and.add(a[i]);
                }
            }
            int ans = and.get(0);

            for(int i=0;i<and.size();i++) ans = ans & and.get(i);
            list.add(ans);
        }

        for(int i=0;i<t;i++) System.out.println(list.get(i));

    }    
}
