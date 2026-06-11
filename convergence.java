
import java.util.*;
public class convergence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int a[]=new int[n];

            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            Arrays.sort(a);

            int m=n/2;

            int l=m-1;
            int r=m+1;
            int same=0;

            while(l>=0 && r<n){
                if(a[l]==a[r]){
                    ++same;
                    ++r;
                    --l;                    
                }else{
                    break;
                }
            }
            if(r<n && n%2==0 && a[l]!=a[r] && a[m]==a[m-1] && m!=0){
                m--;
            }
            int all=0;
            for(int i=1;i<n;i++){
                if(a[i]==a[i-1]) ++all;
            }
            if(all==(n-1)){
                sb.append(0).append("\n");
                continue;
            }
            sb.append(m-same).append("\n");
        }
        System.out.println(sb);
    }
}
