
import java.util.*;
import java.io.*;
public class CollectingGame {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- >0){

            int n = Integer.parseInt(br.readLine());
            ArrayList<int []> a = new ArrayList<>();
            ArrayList<int []> b = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                int element  = Integer.parseInt(st.nextToken());
                a.add(new int[]{element,i});
                b.add(new int[]{element,i});
            }
            a.sort(Comparator.comparing(k->k[0]));
            b.sort(Comparator.comparing(k->k[0]));

            long prefix[] = new long[n];
            prefix[0] = a.get(0)[0];

            for(int i=1;i<n;i++) prefix[i] = prefix[i-1] + a.get(i)[0];
            
            for(int i=n-1;i>=0;i--){
                int count=i;
                    if(i<n-1 && prefix[i]>=a.get(i+1)[0]){
                        count=b.get(i+1)[0];
                    }
                b.set(i, new int[]{count, a.get(i)[1]});
            }
            b.sort(Comparator.comparing(k->k[1]));

            for(int i=0;i<n;i++) System.out.print(b.get(i)[0] + " ");
            System.out.println();
        }
    }
}



