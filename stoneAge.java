
import java.util.*;
import java.io.*;
public class stoneAge {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        long arr[] = new long[n+1];
        int idxVersion[]=new int[n+1];
        int version=0;

        st = new StringTokenizer(br.readLine());
        long sum=0;

        for(int i=1;i<=n;i++){
            arr[i]=Long.parseLong(st.nextToken());
            sum+=arr[i];
        }

        int t;
        long all=-1;
        for(int i=1;i<=q;i++){
            st = new StringTokenizer(br.readLine());
            t = Integer.parseInt(st.nextToken());

            if(t==1){
                int idx = Integer.parseInt(st.nextToken());
                long x = Long.parseLong(st.nextToken());
                long old;

                if(idxVersion[idx]<version){
                    old=all;
                }else{
                    old=arr[idx];
                }
                sum+= -old+x;
                arr[idx]=x;
                idxVersion[idx]=version;
            }else{
                int x = Integer.parseInt(st.nextToken());
                sum=((long)n*x);
                all=x;
                ++version;
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
