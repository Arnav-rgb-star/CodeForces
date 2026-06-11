
import java.util.*;
import java.io.*;
public class loyalty {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            long a[]=new long[n];
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++) a[i]=Long.parseLong(st.nextToken());
            Arrays.sort(a);

            ArrayList<Long> ans = new ArrayList<>();

            long old=0;
            long bp=0;
            long l=0;
            long sum=0;

            int i=0;
            int j=n-1;

            while(i<=j){
                l=(sum+a[j])/x;
                if(l>old){
                    sum+=a[j];
                    bp+=a[j];
                    ans.add(a[j]);
                    --j;
                }else{
                    l=(sum+a[i])/x;
                    if(l>old){
                        sum+=a[i];
                        bp+=a[i];
                        ans.add(a[i]);
                        ++i;
                    }else{
                        sum+=a[i];
                        ans.add(a[i]);
                        ++i;
                    }
                }
                old=l;
            }

            System.out.println(bp);
            for(i=0;i<n;i++) System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}
