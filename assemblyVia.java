
import java.util.*;
import java.io.*;
public class assemblyVia {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            int s = ((n)*(n-1))/2;

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0;i<s;i++) list.add(Integer.parseInt(st.nextToken()));

            Collections.sort(list);
            TreeMap<Integer,Integer> map = new TreeMap<>();

            for(int i=0;i<list.size();i++){
                map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
            }
            ArrayList<Integer> a = new ArrayList<>();

            int i=1;
            int sum=0;

            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                int key = entry.getKey();
                int val = entry.getValue();
                int count=1;
                sum=(n-i);

                while(val>sum){
                    ++i;
                    sum+=(n-i);
                    ++count;
                }
                ++i;
                for(int j=1;j<=count;j++) a.add(key);
            }
                while (a.size()<n) {
                    a.add(list.get(list.size()-1));
                }
                
                for(i=0;i<a.size();i++) System.out.print(a.get(i)+ " ");
                System.out.println();
        }
    }
}
