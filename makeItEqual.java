import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class makeItEqual {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        ArrayList<String> ans = new ArrayList<>();
        
        while(x-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int s[]=new int[n];
            int t[]=new int[n];

            HashMap<Integer,Integer> map = new HashMap<>();
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                s[i]=Integer.parseInt(st.nextToken());
                s[i]%=k;
                int value = Math.min(s[i],k-s[i]);
                map.put(value ,map.getOrDefault(value,0)+1);
                
            }
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                t[i]=Integer.parseInt(st.nextToken());
                t[i]=Math.min(t[i]%k , k- t[i]%k);
        }
            Arrays.sort(t);
            boolean flag=true;
            for(int i=0;i<n;i++){
                if(map.containsKey(t[i]) && map.get(t[i])!=0){
                    map.put(t[i],map.get(t[i])-1);
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag) ans.add("YES");
            else ans.add("NO");

    }
        for(int i=0;i<ans.size();i++) System.out.println(ans.get(i));
    }
}
