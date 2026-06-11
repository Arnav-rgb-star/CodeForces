
import java.io.*;
import java.util.*;
public class whiteBlackBalTrees {
    static int trees;

    public static int dfs(ArrayList<ArrayList<Integer>> list,int node,String s){
        int cnt=0;
        for(int i=0;i<list.get(node).size();i++){
            int ni=list.get(node).get(i);
            cnt+=dfs(list,ni,s);
        }
        cnt+=s.charAt(node-1)=='B'?-1:1;
        if(cnt==0) ++trees;
        return cnt;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            trees=0;

            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int []a = new int[n];
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            for(int i=0;i<=n;i++) list.add(new ArrayList<>());
            for(int i=0;i<n-1;i++){
                a[i]=Integer.parseInt(st.nextToken());
                list.get(a[i]).add(i+2);
            }
            String s = br.readLine();
            dfs(list,1,s);
            sb.append(trees).append("\n");
        }

        System.out.println(sb);
    }
}
