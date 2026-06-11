
import java.util.*;
import java.io.*;
public class balancedTunnel {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt=0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a[]=new int[n+1];
        int b[]=new int[n+1];

        for(int i=1;i<=n;i++) a[i]=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for(int i=1;i<=n;i++) b[i]=Integer.parseInt(st.nextToken());

        HashMap<Integer,Integer> entry = new HashMap<>();
        int max=-1;
        HashMap<Integer,Integer> exit = new HashMap<>();
        for(int i=1;i<=n;i++){
            entry.put(a[i],i);
            exit.put(b[i],i);
        }

        for(int i=1;i<=n;i++){
            int s=entry.get(a[i]);
            int e=exit.get(a[i]);

            if(s>e || max>e) ++cnt;
            max=Math.max(max,e);
        }

        System.out.println(cnt);
        }
}
