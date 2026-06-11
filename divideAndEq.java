
import java.util.*;
import java.io.*;
public class divideAndEq {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb =new StringBuilder();
        
        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            int []a = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());

            HashMap<Integer,Integer> map =new HashMap<>();

            for(int i=0;i<n;i++){
                int v=a[i];
                for(int j=2;j*j<=v;j++){
                    while(v%j==0){
                        map.put(j,map.getOrDefault(j,0)+1);
                        v/=j;
                    }
                }
                if(v>1) map.put(v,map.getOrDefault(v,0)+1);
            }
            boolean possible = true;
            for(Map.Entry<Integer,Integer> entrySet : map.entrySet()){
                int value = entrySet.getValue();
                
                if(value%n!=0){
                    possible=false;
                    break;
                }
            }
            if(possible) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }
}
