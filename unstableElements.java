
import java.io.*;
import java.util.*;
public class unstableElements{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());

            HashMap<Integer,Integer> m = new HashMap<>();

            st = new StringTokenizer(br.readLine());
            for(int i=1;i<=n;i++){
                int value = Integer.parseInt(st.nextToken());
                m.put(value,m.getOrDefault(value,0)+1);
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(Map.Entry<Integer,Integer> entry : m.entrySet()) pq.add(entry.getValue());
            
            int len=n;
            int ans=0;
            int sub=0;

            while(!pq.isEmpty()){
                int min=pq.poll();
                int og = min - sub;
                int groups = (pq.size()+1);

                len-= (og*groups);

                if(target>len && (target-len)%groups==0) ++ans;

                while(!pq.isEmpty() && pq.peek()==min) pq.poll();

                sub+=og;
            }
            sb.append(ans).append("\n");
        }

        System.out.println(sb);
    }
}
