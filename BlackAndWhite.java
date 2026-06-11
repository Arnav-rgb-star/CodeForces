
import java.util.*;
public class BlackAndWhite {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for(int m=0 ; m<t ; m++){
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        Integer[] prefix = new Integer[str.length()+1];
        Arrays.fill(prefix, 0);
        for(int i=1 ; i<=n ; i++){
            prefix[i]=prefix[i-1] + (str.charAt(i-1)=='W'? 1:0);
        }
        int min=Integer.MAX_VALUE;
        
        for(int i=0 ; i<=n-k ; i++){
            int d=prefix[i+k]-prefix[i];
            min=Math.min(min,d);
        }
        list.add(min);
        }

        for(int m=0 ; m<t ; m++){
            System.out.println(list.get(m));
        }
    }
}
