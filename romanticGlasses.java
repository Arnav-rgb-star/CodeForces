
import java.util.*;
import java.io.*;
public class romanticGlasses {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            long []a=new long[n];
            long []pE=new long[n];
            long pO[] = new long[n];

            for(int i=0;i<n;i++){
                a[i]=Long.parseLong(st.nextToken());
            }
            pE[0]=a[0];
            HashMap<Long,Long> map = new HashMap<>();
            boolean flag=false;

            map.put(pE[0]-pO[0],1L);


            for(int i=1;i<n;i++){
                pE[i]+=pE[i-1];
                pO[i]+=pO[i-1];

                if((i&1)==0) pE[i]+=a[i];
                else pO[i]+=a[i];

                map.put(pE[i]-pO[i],map.getOrDefault(pE[i]-pO[i],0L)+1L);

                if(map.get(pE[i]-pO[i])>1 || (pE[i]==pO[i])){
                    flag=true;
                    break;
                }
            }
           if(flag) sb.append("YES").append("\n");
           else sb.append("NO").append("\n");
        }   
        System.out.println(sb);
    }
}
