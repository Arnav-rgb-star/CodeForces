
import java.util.*;
public class MinimiseSum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for(int m=0;m<t;m++){
            int n=in.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            } 
            int sum=0;
            if(a[1]>a[0] && n>=3){
                a[1]=a[1]+a[2];
                a[2]=0;
                sum=2*a[0];
            }
            else{
                if(n==2){
                    if(a[1]>a[0]){
                        sum = 2*a[0];
                    }
                    else{
                        sum = a[0]+a[1];
                    }
                }
                else{
                    a[0]=a[0]+a[1];
                    a[1]=0;
                    sum=a[0];
                }
            }
            list.add(sum);

        }

        for(int m=0;m<t;m++){
            System.out.println(list.get(m));    
        }
    }
}
