
import java.util.*;
import java.io.*;
public class Matryoshkas {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<Integer> ans = new ArrayList<>();

        for(int m=0;m<t;m++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int [] a = new int[n];
            
            TreeMap<Integer,Integer> mp = new TreeMap<>();
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                mp.put(a[i],mp.getOrDefault(a[i],0)+1);
            }
            int min=0;

            for(Map.Entry<Integer,Integer> i : mp.entrySet()){
                int key = i.getKey();
                int val = i.getValue();
                min+= Math.max(val-mp.getOrDefault(key-1,0),0);
            }
            ans.add(min);
        }
        
        for(int i=0;i<t;i++) System.out.println(ans.get(i));
    }
}
