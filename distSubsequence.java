
import java.io.*;
import java.util.*;
public class distSubsequence {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(br.readLine());
       StringBuilder sb = new StringBuilder(); 

       while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            long a[]=new long[n];
            for(int i=0;i<n;i++) a[i]=Long.parseLong(st.nextToken());
            ArrayList<Long> list = new ArrayList<>();

            long sum=0;
            for(int i=0;i<n;i++) sum+=a[i];

            list.add(a[0]);
            for(int i=1;i<n-1;i++){
                long prev=list.get(list.size()-1);
                long x=Math.abs(a[i]-prev);
                long y=Math.abs(a[i]-a[i+1]);

                if((x+y)<=Math.abs(prev-a[i+1])){
                    a[i]=-1;
                }else{
                    list.add(a[i]);
                }
            }
            list.add(a[n-1]);

            sb.append(list.size()).append("\n");
            for(int i=0;i<list.size();i++) sb.append(list.get(i) + " ");
            sb.append("\n");
       }
       System.out.println(sb);
    }
}
