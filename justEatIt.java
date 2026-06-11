
import java.io.*;
import java.util.*;
public class justEatIt {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        ArrayList<String> ans = new ArrayList<>();

        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int []a= new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            long s=0;
            long sum=0;

            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                s+=a[i];
            }
            int cnt=0;

            long max=-Long.MIN_VALUE;

            for(int i=0;i<n;i++){
                sum+=a[i];
                if(sum<0){
                    sum=0;
                }
                if(max<sum){
                    max=sum;
                }
            }

            if(sum>max){
                ans.add("YES");
            }else if(sum==max){
                long temp=0;
                for(int i=0;i<n;i++){
                    cnt++;
                    temp+=a[i];
                    if(temp==sum) break;

                    if(temp<=0){
                        temp=0;
                        cnt=0;
                    }
                }
                if(cnt==n){
                    ans.add("YES");
                }else{
                    ans.add("NO");
                }
            }else{
                ans.add("NO");
            }
        }       

        for(int i=0;i<ans.size();i++) System.out.println(ans.get(i));
    }
}
