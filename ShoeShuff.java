
import java.util.*;
public class ShoeShuff {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- >0) {
            int n=in.nextInt();
            int[] a = new int[n];
            for(int i=0 ; i<n ; i++){
                a[i]=in.nextInt();
            }
            if(a.length==1){
                System.out.println(-1);
                continue;
            }
            List<int[]> pairs = new ArrayList<>();
            boolean valid = true;
            int i=0;
            int j=1;
            int prev=1,count=1;
            while(i!=a.length && j!=a.length){
                if(a[i]==a[j]){
                    ++count;
                }
                else{
                    count=1;
                    if(prev==1){
                        valid=false;
                        break;
                    }
                    else{
                        i=j;
                    }
                }
                prev=count;
                ++j;
            }
            if(!valid || count==1){
                System.out.print(-1);
            }
            else{
                i=0;
                j=1;
                count = 1;
                while(i!=a.length && j!=a.length){
                    if(a[i]==a[j]){
                        ++count;
                    }
                    else{
                        pairs.add(new int[]{i, j - 1});
                        i = j;
                        count = 1;
                    }
                    ++j;
                }
            pairs.add(new int[]{i, j - 1});
            for(i=0 ; i<pairs.size() ; i++){
                int start = pairs.get(i)[0];
                int end = pairs.get(i)[1];
                System.out.print((end+1)+" ");
                for(j=start ; j<end ; j++){
                System.out.print((j+1)+ " ");
                }
            }
            }
            System.out.println();
        }
    }
}
