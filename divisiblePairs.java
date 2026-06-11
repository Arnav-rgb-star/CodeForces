

import java.io.*;
import java.util.*;
public class divisiblePairs {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        
        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            int []a = new int[n+1];
            for(int i=1;i<=n;i++) a[i]=Integer.parseInt(st.nextToken());

            int []b = new int[n+1];

            for(int i=1;i<=n;i++) b[i]=a[i]%y;
            for(int i=1;i<=n;i++) a[i]=a[i]%x;

            long cnt=0;

            HashMap<ArrayList<Integer>,Long> map = new HashMap<>();

            for(int i=1;i<=n;i++){
                int req1 = (Math.abs(x-a[i]))%x;
                int req2 = b[i];

                ArrayList<Integer> list = new ArrayList<>();
                list.add(a[i]);
                list.add(b[i]);

                ArrayList<Integer> search= new ArrayList<>();
                search.add(req1);
                search.add(req2);

                cnt+=map.getOrDefault(search,0L);
                map.put(list,map.getOrDefault(list,0L)+1L);
            }

            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
