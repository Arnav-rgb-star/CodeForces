
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class vikaAndBridge {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int a[] = new int[n+1];
            for(int i=1;i<=n;i++) a[i]=Integer.parseInt(st.nextToken());

            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>());

            for(int i=1;i<=k;i++) list.add(new ArrayList<>());

            for(int i=1;i<=k;i++){
                list.get(i).add(0);
            }

            for(int i=1;i<=n;i++) list.get(a[i]).add(i);

            for(int i=1;i<=k;i++){
                list.get(i).add(n+1);
            }

            ArrayList<ArrayList<Integer>> gaps = new ArrayList<>();
            gaps.add(new ArrayList<>());

            for(int i=1;i<=k;i++){
                gaps.add(new ArrayList<>());
            }

            for(int i=1;i<=k;i++){
                for(int j=0;j<list.get(i).size()-1;j++){
                    gaps.get(i).add(list.get(i).get(j+1)-list.get(i).get(j)-1);
                }
            }

            for(int i=1;i<=k;i++){
                Collections.sort(gaps.get(i),Collections.reverseOrder());
            }
            
            int min=Integer.MAX_VALUE;

            for(int i=1;i<=k;i++){
                int max=gaps.get(i).get(0);
                int max2=(gaps.get(i).size()>1)?gaps.get(i).get(1):0;

                gaps.get(i).remove(0);
                
                if(max%2==0){
                    gaps.get(i).add(max/2);
                    gaps.get(i).add((max/2) -1);
                }else{
                    gaps.get(i).add(max/2);
                    gaps.get(i).add((max/2));
                }
                Collections.sort(gaps.get(i),Collections.reverseOrder());

                min = Math.min(min,Math.max(max2,gaps.get(i).get(0)));
            }
            sb.append(min).append("\n");
        }
        System.out.println(sb);
    }    
}
