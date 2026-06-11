
import java.util.*;
public class bipartiteness {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean color[];
    static boolean visited[];

    static void dfs(int node,boolean clr){
        visited[node]=true;
        color[node]=clr;

        for(int i=0;i<graph.get(node).size();i++){
            int nigga = graph.get(node).get(i);
            if(!visited[nigga]){
                dfs(nigga,!clr);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int n = sc.nextInt();
            long x=0,y=0;

            for(int i=0;i<n;i++){
                graph.add(new ArrayList<>());
            }
            for(int i=0;i<n-1;i++){
                int u = sc.nextInt()-1;
                int v = sc.nextInt()-1;

                graph.get(u).add(v);
                graph.get(v).add(u);

            }
            visited = new boolean[n];
            color = new boolean[n];

            dfs(0,false);

            for(int i=0;i<n;i++){
                if(color[i]) ++x;
                else ++y;
            }

            long pos=(x*y)-(long)(n-1);
            System.out.println(pos);
    }
}

