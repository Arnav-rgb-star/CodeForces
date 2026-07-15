
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class weirdSum {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());

            long a[][]=new long[n][m];
            for(int i=0;i<n;i++){
                st =new StringTokenizer(br.readLine());
                for(int j=0;j<m;j++){
                    a[i][j]=Long.parseLong(st.nextToken());
                }
            }
            HashMap<Long,ArrayList<int[]>> mp = new HashMap<>();

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    mp.putIfAbsent(a[i][j],new ArrayList<>());
                    mp.get(a[i][j]).add(new int[]{i+1,j+1});
                }
            }
            long dist=0;

            for(Map.Entry<Long,ArrayList<int[]>> set : mp.entrySet()){
                long key=set.getKey();

                ArrayList<int[]> list = set.getValue();
                Collections.sort(list,(x, b) -> Integer.compare(x[0], b[0]));

                long pref=0;
                for(int i=0;i<list.size();i++){
                    dist+= (long)list.get(i)[0]*i - pref;
                    pref+= (long)list.get(i)[0];
                }

                Collections.sort(list,(x,b)->Integer.compare(x[1],b[1]));
                pref=0;

                for(int i=0;i<list.size();i++){

                    dist+= (long)list.get(i)[1]*i - pref;
                    pref+=(long)list.get(i)[1];
                }

            }
        sb.append(dist).append("\n");
        System.out.println(sb);
    }
}
