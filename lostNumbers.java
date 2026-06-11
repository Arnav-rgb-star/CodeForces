
import java.util.*;
public class lostNumbers {
    public static int query(Scanner in,int i,int j){
        System.out.println("? " + i + " " + j);
        System.out.flush();
        return in.nextInt();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[]=new int[7];
        int[] s = {4,8,15,16,23,42};
        
        int q1=query(in,1,1);
        int q2=query(in,2,2);
        int q3=query(in,3,4);
        int q4=query(in,3,5);

        a[1]=(int)Math.sqrt((int)q1);
        a[2]=(int)Math.sqrt((int)q2);

        for(int x:s){
            boolean found=false;
            for(int  y:s){

                if(q3*x ==q4*y){
                    a[4]=y;
                    a[5]=x;
                    a[3]=q3/a[4];

                    boolean can=false;
                    for(int i=0;i<6;i++){
                        if(a[3]==s[i]){
                            can=true;
                            break;
                        }
                    }
                    if(can && (q3%a[4]==0) && (q4%a[5]==0) && q3/a[4] == q4/a[5] && a[3]!=a[1] && a[3]!=a[2] && a[3]!=a[4] && a[3]!=a[5] && a[5]!=a[1] && a[5]!=a[2] && a[4]!=a[1] && a[4]!=a[2] && a[4]!=a[5] && a[5]!=a[1] && a[5]!=a[2]){ 
                        found=true;
                        break;
                    }
                }
            }
            if(found) break;
        }
        
        for(int x:s){
            boolean present=false;
            for(int i=1;i<7;i++){
                if(a[i]==x){
                    present=true;
                    break;
                }
            }
            if(!present) a[6]=x;
        }
        System.out.print("! ");
        for(int i=1;i<7;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
