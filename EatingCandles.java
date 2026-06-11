
import java.util.*;
public class EatingCandles {

    public static int bs(int[] a,int target){
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>a[mid]){
                start=mid+1;
            }
            else if(target<a[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int k=0;k<t;k++){
            int n=in.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=in.nextInt();
            int[] prefix = new int[n];
            prefix[0]=a[0];
            int[] suffix = new int[n];
            suffix[n-1]=a[n-1];
            for(int i=1;i<n;i++){
                prefix[i]=prefix[i-1]+a[i];
            }
            for(int i=n-2;i>=0;i--){
                suffix[i]=suffix[i+1]+a[i];
            }
            int max=0;
            for(int i=n-1;i>=0;i--){
                int index=bs(prefix,suffix[i]);
                if(index== -1) continue;
                if(index>=i){
                    break;
                }
                int dis= index + (n-i) + 1;
                max = Math.max(max,dis);
            }
            ans.add(max);
        }

        for(int k=0;k<t;k++){
            System.out.println(ans.get(k));
        }
    }
}
