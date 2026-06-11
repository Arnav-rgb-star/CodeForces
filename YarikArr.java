
import java.util.*;
import java.io.*;
public class YarikArr {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int m=0;m<t;m++){  
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = Integer.parseInt(st.nextToken());

            int cS=0;
            int mS=arr[0];
            boolean prev = false;

            for(int i=0;i<n;i++){
                if(i>0 && (arr[i]&1)==(arr[i-1]&1) ) prev=true;
                else prev=false;

                if(prev) cS=0;
                
                cS+= arr[i];
                if(cS>mS) mS=cS;
                if(cS<0) cS=0;

                
            }
            list.add(mS);
        }

        for(int m=0;m<t;m++){
            System.out.println(list.get(m));    
        }
    }
}
