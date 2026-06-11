
import java.util.*;
public class MExoup {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0 ; i<t ; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int length=0;
            int x;
            if((a-1) %  4 == 0){
                x=a-1;
            }
            else if((a-1) %  4==1){
                x=1;
            }
            else if((a-1)%4==2){
                x=(a);
            }
            else{
                x = 0;
            }
            if(x==b){
                length = a;
            }
            else if((x^b)==a){
                length=a+2;
            }
            else{
                length = a+1;
            }
            System.out.println(length);
        }
    }
}
