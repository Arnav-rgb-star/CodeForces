
import java.io.*;
import java.util.*;
public class yarikAndMusicalNotes {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a[]=new long[n];
            long pairs=0;

            HashMap<Long,Long> m = new HashMap<>();
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                m.put(a[i],m.getOrDefault(a[i],0L)+1);
            }
            for(Map.Entry<Long,Long> entry : m.entrySet()){
                if(entry.getKey()==1 || entry.getKey()==2) continue;
                long v = entry.getValue();

                pairs+= (v*(v-1))/2;  
            }
            long total=0;
            if(m.containsKey(1L)) total+=m.get(1L);
            if(m.containsKey(2L)) total+=m.get(2L);
            pairs+= (total*(total-1))/2;

            sb.append(pairs).append("\n");
        }

        System.out.println(sb);
    }
}
