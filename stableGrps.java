
import java.io.*;
import java.util.*;
public class stableGrps {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        long x = Long.parseLong(st.nextToken());

        long a[] = new long[n];
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++) a[i]=Long.parseLong(st.nextToken());;
        Arrays.sort(a);

        ArrayList<Long> gaps = new ArrayList<>();

        for(int i=1;i<n;i++) {
            long diff=a[i]-a[i-1];
            if (diff >x) {
                gaps.add((diff - 1) / x);
            }
        }
        Collections.sort(gaps);
        long split=1;
        for(int i=0;i<gaps.size();i++){
                long req = gaps.get(i);
                if(k>=req) k-=req;
                else ++split;
        }
        System.out.println(split);
    }
}
