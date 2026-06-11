
import java.util.*;
public class NIT {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-- >0){
            int n = in.nextInt();
            int[] a = new int[n];
            int con = 0,zeros=0;

            for(int i=0 ; i<n ; i++){
                a[i] = in.nextInt();
                if(a[i]==0){
                    ++zeros;
                }
            }
            if(zeros == a.length){
                System.out.println("0");
                continue;
            }
            if(zeros == a.length-1){
                System.out.println("1");
                continue;
            }

            int not=1;
            for(int i=0 ; i<a.length-1 ; i++){
                if(a[i]!=0 && a[i+1]!=0){
                    ++not;
                }
            }

            if(a[0] == 0 && a[a.length-1] != 0){

                for(int i=0 ; i<n-1 ; i++){
                if(a[i] == 0 && a[i+1] == 0){
                    ++con;
                }
                else{
                    break;
                }
            }
            ++con;   
            }
            else if(a[a.length-1] == 0 && a[0]!=0){

                for(int i=a.length-1 ; i>0 ; i--){
                if(a[i] == 0 && a[i-1] == 0){
                    ++con;
                }
                else{
                    break;
                }
            }
            ++con;   
            }
            if(con == zeros){
                System.out.println("1");
                continue;
            }

            if(zeros + not == a.length){
                System.out.println("1");
                continue;
            }

            System.out.println("2");
        }
    }
}
