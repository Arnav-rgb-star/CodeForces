
import java.util.*;
public class Quests {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        LinkedList<Integer> list=new LinkedList<>();

        for(int m=0;m<t;m++){
            int n=in.nextInt();
            int k=in.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];

            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=in.nextInt();
            }
            int[] prefix=new int[n];
            int[] greater=new int[n];
            prefix[0]=a[0];
            greater[0]=b[0];

            for(int i=1;i<n;i++){
                if(greater[i-1]<b[i]){
                    greater[i]=b[i];
                }
                else{
                    greater[i]=greater[i-1];
                }
            }
            for(int i=1;i<n;i++){
                prefix[i]=prefix[i-1]+a[i];
            }
            int sum=0,max=0;
            if(k<n){
            max=prefix[k-1];
            for(int i=k-1;i>=1;i--){
                sum=prefix[i-1] + greater[i-1]*(k-i);
                max=Math.max(sum,max);
            }
        }
            else {
            max = prefix[n-1]+greater[n-1]*(k-n);
            for(int i=n-1;i>=1;i--){
                sum=prefix[i-1] + greater[i-1]*(k-i);
                max=Math.max(sum,max);
            }
        }
            list.add(max);

        }
        for(int m=0;m<t;m++){
            System.out.println(list.get(m));    
        }
    }
}

