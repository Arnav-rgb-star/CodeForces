
import java.io.*;
import java.util.*;
public class taylorTrees {
    static class Pair{
        int v;
        int idx;
        
        Pair(int v,int idx){
            this.v=v;
            this.idx=idx;
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Pair> g = new ArrayList<>();  

            for(int i=0;i<n;i++){
                int val=Integer.parseInt(st.nextToken());
                g.add(new Pair(val,i));
            }
            Collections.sort(g, Comparator.comparingInt(a -> a.v));
            int min=g.get(0).idx;
            int max=g.get(n-1).idx;
            int l[]=new int[n];
            int r[]=new int[n];
            boolean can=true;

            l[0]=min;
            for(int i=1;i<n;i++){
                min=Math.min(min,g.get(i).idx);
                l[i]=min;
            }

            r[n-1]=max;
            for(int i=n-2;i>=0;i--){
                max=Math.max(max,g.get(i).idx);
                r[i]=max;
            }
            for(int i=0;i<(n-1);i++){
                if(l[i]>r[i+1]){
                    can=false;
                    break;
                }
            }
            if(can) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }
}
