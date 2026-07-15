
import java.io.*;
import java.util.*;
public class berlandRegional {
    public static void main(String[] args)throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int u[]=new int[n];
            long s[]=new long [n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) u[i]=Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++) s[i]=Integer.parseInt(st.nextToken());
            long prefix[]=new long[n+1];

            HashMap<Integer,ArrayList<Long>> m = new HashMap<>();
            for(int i=0;i<n;i++){
                m.computeIfAbsent(u[i],k->new ArrayList<>()).add(s[i]);
            }
            for(Map.Entry<Integer,ArrayList<Long>> entry : m.entrySet()){
                ArrayList<Long> list = entry.getValue();
                list.sort(Collections.reverseOrder());

                for(int i=1;i<list.size();i++){
                    list.set(i,list.get(i)+list.get(i-1));
                }
                for(int i=0;i<list.size();i++){
                    int l = list.size();
                    int idx = l-(l%(i+1));
                    if(idx>0) prefix[i+1] += list.get(idx-1);
                }
            }
            for(int i=1;i<=n;i++){
                sb.append(prefix[i] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
