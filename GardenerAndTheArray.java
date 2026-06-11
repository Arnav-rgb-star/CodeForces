
import java.util.*;
import java.io.*;
public class GardenerAndTheArray {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            boolean flag=false;
            HashMap<Integer,Integer> map = new HashMap<>();
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            for(int i=0;i<n;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int k = Integer.parseInt(st.nextToken());
                list.add(new ArrayList<>());

                for(int j=0;j<k;j++){
                    int b = Integer.parseInt(st.nextToken());
                    list.get(i).add(b);
                    map.put(b,map.getOrDefault(b,0)+1);
                }
            }
            
            for(int i=0;i<n;i++){
                boolean ok =true;
                for(int j=0;j<list.get(i).size();j++){
                    int val = list.get(i).get(j);

                    if(map.get(val)==1){
                        ok=false;
                        break;
                    }
                }
                if(ok) flag=true;
            }

            if(flag) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }
}
