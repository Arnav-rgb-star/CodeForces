
import java.util.*;
public class mons {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int n,k;
            n = in.nextInt();
            k = in.nextInt();
            ArrayList<int []> a = new ArrayList<>();
            for(int i=0;i<n;i++){
                int x = in.nextInt();
                int hp = x%k;
                hp = (x%k!=0)?hp:k;
                a.add(new int[]{hp,i+1});
            }
        
            a.sort((x,y)->{
                if(x[0]!=y[0]) return Integer.compare(y[0],x[0]);
                return Integer.compare(x[1],y[1]);
            });

            for(int i=0 ; i<n ; i++){
                System.out.print(a.get(i)[1]+" ");
            }
            System.out.println();
        }
    }
}
