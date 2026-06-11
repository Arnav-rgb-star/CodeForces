import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.StringTokenizer;
public class virus {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            int m=Integer.parseInt(st.nextToken());

            long inf[]=new long[m];
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<m;i++) inf[i]=Long.parseLong(st.nextToken());
            Arrays.sort(inf);

            ArrayList<Long> gap = new ArrayList<>();
            gap.add(n-inf[m-1]+inf[0]-1);

            for(int i=1;i<m;i++) gap.add(inf[i]-inf[i-1]-1);
            Collections.sort(gap,Collections.reverseOrder());       

            long sum=0;
            long times=0;
            //System.out.println(gap.toString());

            for(int i=0;i<gap.size();i++){
                long red = gap.get(i)-2*times;
                times+=2;

                if(red>1) --red;
                if(red<0) red=0;
                sum+=red;
            }

            sb.append(n-sum).append("\n");
        }
        System.out.println(sb);
    }
}
