
import java.util.*;
import java.io.*;
public class Substract {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<String> ans = new ArrayList<>();
        
        for(int m=0;m<t;m++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
           
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) a[i] = Integer.parseInt(st.nextToken());
            HashMap<Integer,Boolean> map = new HashMap<>(); 
        
            for(int i=0;i<n;i++) map.put(a[i],true);
            
            boolean found = false;
            for(int i=0;i<n;i++){
                if(map.containsKey(a[i]-k)){
                    found=true;
                    break;
                }
            }
            if(found){
                ans.add("YES");
            }
            else ans.add("NO");
        }
        for(int i=0;i<t;i++) System.out.println(ans.get(i));
    }    
}
