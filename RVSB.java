
import java.util.*;
public class RVSB {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        String[] str = new String[t];

        for(int i=0 ; i<t ; i++){
        
        int n,r,b;
        
        n = in.nextInt();
        r = in.nextInt();
        b = in.nextInt();
        
        StringBuilder sb = new StringBuilder() ; 
        
        int red = r/(b+1);
        int div = (b+1);
        int extra_red = r%(b+1);

        for(int j=0 ; j<div ; j++){
            for(int k=0 ; k<red ; k++){
                sb.append('R');
            }
            if(extra_red!=0){
                sb.append('R');
                --extra_red;
            }
            if(j!=div-1){
                sb.append('B');
            }
        }
            str[i] = sb.toString();
        }
        for(int i = 0 ; i<t ; i++){
            System.out.println(str[i]);
        }
    }
}
