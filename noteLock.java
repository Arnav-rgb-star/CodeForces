
import java.util.*;
public class noteLock {
    public static void main(String[] args) {
        Scanner tb = new Scanner(System.in);
        ArrayList<Integer> ans = new ArrayList<>();

        int t = tb.nextInt();
        for(int m=0;m<t;m++){
            int n = tb.nextInt();
            int k = tb.nextInt();

            String str= tb.next();
            int pos=0;

            for(int i =0;i<n;i++){
                if(str.charAt(i)== '1'){
                    boolean works= true;
                    for(int j = i-k+1; j<=i-1;j++){

                    if(j>=0 && str.charAt(j) == '1'){
                        works= false;
                        break;
                        }
                    }
                    if(works){
                        ++pos;
                    }
                }
            }
            ans.add(pos);
        }

        for(int m=0;m<t;m++) System.out.println(ans.get(m));
    }
}
