
import java.io.*;
import java.util.*;
public class Divan {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- >0){
            
            int n=Integer.parseInt(br.readLine());
            int[] a=new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            ArrayList<int[]> pairs = new ArrayList<>();
            int[] diff=new int[n+1];
            int mid=(n/2);
            int count=0;
            for(int i=mid;i<=n;i++){
                diff[i]=count;
                ++count;
            }
            count=1;
            for(int i=mid-1;i>=0;i--){
                diff[i]=count;
                ++count;
            }
            for(int i=0;i<n;i++){
                pairs.add(new int[]{a[i],i+1,0});
            }
            Arrays.sort(a);
            pairs.sort(Comparator.comparingInt(b->b[0]));
            int head=0;
            for(int i=0;i<=n;i++){
                if(diff[i]==0){
                    head=i+1;
                    break;
                }
            }
            List<int[]> grind = new ArrayList<>();
            for(int i=0;i<=n;i++){
                if(diff[i]!=0){
                grind.add(new int[]{diff[i],i+1});
                }
            }

            Arrays.sort(diff);
            grind.sort(Comparator.comparing(k->k[0]));

            for(int i=0;i<n;i++){
                pairs.get(i)[2]=grind.get(n-i-1)[1];
            }

            pairs.sort(Comparator.comparing(l->l[1]));

            long time=0;
            for(int i=diff.length-1;i>=1;i--){
                time+= 2L *diff[i]*a[n-i];
            }
            System.out.println(time);
            System.out.print(head + " ");
            for(int j=0; j<n;j++){
                System.out.print(pairs.get(j)[2] + " ");
            }
            System.out.println();

        }
    }
}