
import java.util.*;
import java.io.*;
public class contrastVal {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            int gunda[] = new int[n];
            ArrayList<Integer> list=  new ArrayList<>();

            StringTokenizer st =new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) gunda[i]=Integer.parseInt(st.nextToken());

            list.add(gunda[0]);
            for(int i=1;i<n;i++){
                if(gunda[i]!=gunda[i-1]){
                    list.add(gunda[i]);
                }
            }
            int count=list.size();
            if(count<=2){
                sb.append(count).append("\n");
                continue;
            }

            for(int i=1;i<list.size()-1;i++){
                if((list.get(i)>list.get(i+1)) && (list.get(i-1) > list.get(i))) --count;
                if((list.get(i)<list.get(i+1)) && (list.get(i-1)<list.get(i))) --count;
            }
            sb.append(count).append("\n");
        } 

        System.out.println(sb);
    }
}
