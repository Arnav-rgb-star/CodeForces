
import java.util.*;
import java.io.*;
public class goodArray {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a[]=new long[n];
        HashMap<Long,Long> map = new HashMap<>();
        long sum=0;

        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
            sum+=a[i];
            map.put(a[i],map.getOrDefault(a[i],0L)+1);
        }
        int cnt=0;
        ArrayList<Integer> list= new ArrayList<>();

        for(int i=0;i<n;i++){
            long k=sum-a[i];

            if(k%2==0 && map.containsKey(k/2)){
                    if(k/2 != a[i] || map.get(k/2)>1){
                        cnt++;
                        list.add(i+1);
                    }
            }
        }
        System.out.println(cnt);
        for(int i=0;i<list.size();i++) System.out.print(list.get(i) + " ");
    }
}
