
import java.io.*;
import java.util.*;
public class deepDownBelow {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(new ArrayList<>());
                int max = 0;
                
                StringTokenizer st = new StringTokenizer(br.readLine());
                int k = Integer.parseInt(st.nextToken());
                int a[] = new int[k];

                for(int j=0;j<k;j++){
                    a[j]=Integer.parseInt(st.nextToken());
                    if(j==0){
                        max=a[0]+1;
                    }else if(max<(a[j]+1-j)){
                        max=a[j]+1-j;
                    }
                }
                list.get(i).add(max);
                list.get(i).add(k);
            }
            Collections.sort(list,(a,b)->{
                if(!a.get(0).equals(b.get(0))){
                    return a.get(0)-b.get(0);
                }else{
                    return a.get(1)-b.get(1);
                }
            });
            int min=list.get(0).get(0);
            int in=list.get(0).get(1);

            for(int i=1;i<list.size();i++){
                min=Math.max(min,list.get(i).get(0)-in);
                in+=list.get(i).get(1);
            }

            sb.append(min).append("\n");

        }
        System.out.println(sb);
    }
}
