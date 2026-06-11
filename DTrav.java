
import java.util.*;
import java.io.*;
public class DTrav {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        ArrayList<Long> ans = new ArrayList<>();

        for(int z=0;z<t;z++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int k =Integer.parseInt(st.nextToken());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            int arr[][] = new int[n][2];

            for(int i=0;i<n;i++){
                st = new StringTokenizer(br.readLine());
                arr[i][0]=Integer.parseInt(st.nextToken());
                arr[i][1]=Integer.parseInt(st.nextToken());
            }
            
            long cost=Math.abs((long)arr[a-1][0]-arr[b-1][0])+Math.abs((long)arr[a-1][1]-arr[b-1][1]);
            long minA = Long.MAX_VALUE;
            long minB = Long.MAX_VALUE;

            for(int i=0;i<k;i++){
                long cost1 = Math.abs((long)arr[a-1][0]-arr[i][0])+Math.abs((long)arr[a-1][1]-arr[i][1]);
                minA = Math.min(cost1,minA);

                long cost2 = Math.abs((long)arr[b-1][0]-arr[i][0])+Math.abs((long)arr[b-1][1]-arr[i][1]);
                minB = Math.min(cost2,minB);
                
                cost = Math.min(cost,minA+minB);
            }

            ans.add(cost);
        }
        
        for(int i=0;i<t;i++) System.out.println(ans.get(i));
    }
}
