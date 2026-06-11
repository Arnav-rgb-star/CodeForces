
import java.io.*;
import java.util.*;
public class dormsWar {
    public static boolean found(char []c,char ch){
        
        for(int i=0;i<c.length;i++){
            if(c[i]==ch){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();

            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());

            char []c = new char[k];

            for(int i=0;i<k;i++) c[i] = st.nextToken().charAt(0);

            ArrayList<Integer> list = new ArrayList<>();

            for(int i=0;i<n;i++){
                boolean special = found(c,str.charAt(i));
                if(special){
                    list.add(i);
                }
            }

            if(list.size()==0){
                sb.append(0).append("\n");
            }else if(list.size()==1){
                sb.append(list.get(0)).append("\n");
            }else{
                int maxDiff=-1;
                for(int i=1;i<list.size();i++){
                    int diff = list.get(i)-list.get(i-1)-1;
                    if(diff>maxDiff){
                        maxDiff=diff;
                    }
                }
                maxDiff = Math.max(list.get(0),maxDiff+1);
                sb.append(maxDiff).append("\n");
            }
        }

        System.out.println(sb);
    }    
}
