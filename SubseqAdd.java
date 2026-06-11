
import java.io.*;
import java.util.*;
public class SubseqAdd {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> ans = new ArrayList<>();

        int l = Integer.parseInt(br.readLine());

        for(int k=0;k<l;k++){
            int n = Integer.parseInt(br.readLine());
            int [] a = new int[n];
            long prefix[] = new long[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i] = Integer.parseInt(st.nextToken());
            }

            boolean found = false;
            Arrays.sort(a);

            prefix[0]=a[0];
            if(a[0]!=1){
                found=true;
                ans.add("NO");
                continue;
            }

            for(int i=1;i<n;i++) prefix[i]=prefix[i-1]+a[i];

            for(int i=1;i<n;i++){
                if(prefix[i-1] < a[i]){
                    found = true;
                    break;
                }
            }
            if(found){
                ans.add("NO");
            }
            else{
                ans.add("YES");
            }
        }
        for(int i=0;i<l;i++) System.out.println(ans.get(i));
    }
}
