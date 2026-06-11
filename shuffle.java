
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class shuffle {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int x=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());

            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for(int i=0;i<m;i++){
                st = new StringTokenizer(br.readLine());
                list.add(new ArrayList<>());
                list.get(i).add(Integer.parseInt(st.nextToken()));
                list.get(i).add(Integer.parseInt(st.nextToken()));
            }
            int idx=-1;
            for(int i=0;i<m;i++){
                if(x>=list.get(i).get(0) && x<=list.get(i).get(1)){
                    idx=i;
                    break;
                }
            }

            if(idx==-1){
                sb.append(1).append("\n");
                continue;
            }
            int l=list.get(idx).get(0),r=list.get(idx).get(1);
  
            for(int i=idx;i<m;i++){
                int a=list.get(i).get(0);
                int b=list.get(i).get(1);
                
                if((a>=l && a<=r) || (b>=l && b<=r) || (a<=l && b>=r)){
                    l=Math.min(l,a);
                    r=Math.max(r,b);
                }
            }
            sb.append(r-l+1).append("\n");
        }

        System.out.println(sb);
    }
}
