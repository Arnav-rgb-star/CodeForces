
import java.io.*;
import java.util.*;
public class omskProgrammers{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            int ops=Integer.MAX_VALUE;
            ArrayList<Integer> l = new ArrayList<>();
            ArrayList<Integer> r = new ArrayList<>();

            while(true){
                l.add(a);
                if(a==0) break;
                else a/=x;
            }

            while(true){
                r.add(b);
                if(b==0) break;
                else b/=x;
            }
            
            for(int i=0;i<l.size();i++){
                for(int j=0;j<r.size();j++){
                    ops=Math.min(i+j+Math.abs(l.get(i)-r.get(j)),ops);
                }
            }
            sb.append(ops).append("\n");
        }
        System.out.println(sb);
    }
}
