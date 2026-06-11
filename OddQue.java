
import java.util.*;
public class OddQue {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for(int m=0 ; m<t ; m++){
            int n = in.nextInt();
            int q = in.nextInt();
            int a[] = new int[n];
            int[][] Q = new int[q][3];
            long sum=0;
            for(int i=0 ; i<n ; i++){
                a[i] = in.nextInt();
                sum+=a[i];
            }
            for(int i=0 ; i<q ; i++){
                for(int j=0 ; j<3 ; j++){
                    Q[i][j] = in.nextInt();
                }
            }
            long[] prefix = new long[(n+1)];
            Arrays.fill(prefix, 0);

            for(int i=1 ; i<=n ; i++){
                prefix[i] = prefix[i-1]+a[i-1];
            }

            for(int i=0 ; i<q ; i++){
                int start = Q[i][0];
                int end = Q[i][1];
                int num = Q[i][2];

                long new_sum = sum - ( prefix[end]- prefix[start-1]) + num*(end-start + 1);
                if(new_sum % 2==0){
                    list.add("NO");
                }
                else{
                    list.add("YES");
                }
            }
        }

        for(int m=0 ; m<list.size() ; m++){
            System.out.println(list.get(m));
        }
    }
}
