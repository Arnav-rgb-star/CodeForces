
import java.util.*;
public class NumberBox {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        int[] sum = new int[t];

        for(int k=0 ; k<t ; k++){
            int n = in.nextInt();
            int m = in.nextInt();

            int[][] a = new int[n][m];
            for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<m ; j++){
                    a[i][j] = in.nextInt();
                }
            }
                int abs = 0, min = Integer.MAX_VALUE;
                 for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<m ; j++){
                    abs += Math.abs(a[i][j]);
                }
            }

            int count_negative = 0;
            for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<m ; j++){
                    if( a[i][j] <0 ){
                        ++count_negative;
                    }
                }
            }
            if(count_negative % 2 ==0 ){
                min = 0;
            }
            else{
                for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<m ; j++){
                    if(Math.abs(a[i][j]) <= Math.abs(min)){
                        min = a[i][j];
                    }
                }
            }
            }

            sum[k] = abs - 2*Math.abs(min);
        } 
        for(int k=0 ; k<t ; k++){
            System.out.println(sum[k]);
        }
    }
}
