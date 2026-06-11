import java.io.*;
import java.util.*;

public class twoPairs {

    public static long bs(ArrayList<Integer> list,int val){
        long l=0;
        long r=list.size()-1;

        while(l<r){

            long m=l+(r-l)/2;
            if(val>list.get((int)m)) l=m+1;
            else r=m;
        }

        return l;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int a[]=new int[n];

            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());

                if(a[i]<(i+1)) list.add(i+1);
            }
            long cnt=0;

            for(int i=0;i<list.size();i++){
                cnt+=bs(list,a[list.get(i)-1]);
            }

            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
