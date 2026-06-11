
import java.io.*;
import java.util.*;
public class maximalAnd{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        ArrayList<Long> ans = new ArrayList<>();

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int a[]=new int[n];
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());

            int bin[][]=new int[n][31];

            for(int i=0;i<n;i++){
                for(int j=0;j<31;j++){
                    bin[i][j]= ((a[i]>>j)&1);
                }
            }
            int b[]=new int[31];
            
            for(int i=0;i<n;i++){
                for(int j=0;j<31;j++){
                    if(bin[i][j]==1){
                        ++b[j];
                    }
                }
            }
            long sum=0;
            for(int i=30;i>=0;i--){
                if((n-b[i])<=k){
                    
                    k-=(n-b[i]);
                    b[i]=n;
                    sum +=(1L<<i); 
                }
            }
            ans.add(sum);
        }

        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}