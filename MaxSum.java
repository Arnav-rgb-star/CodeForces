
import java.lang.reflect.Array;
import java.util.*;
public class MaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        LinkedList<Long> ans  =new LinkedList<>();

        for(int p=0;p<t;p++){
        int n=in.nextInt();
        int k=in.nextInt();
        int[] nums = new int[n];
        long[] prefix=new long[n];
        long sum=0;
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        Arrays.sort(nums);
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int l=0;l<=k;l++){
            int r=k-l;
            int left=2*l;
            int right=(n-1-r);
            long max=0;
            if(l!=0){
                max=prefix[right]-prefix[left-1];
            }
            else{
                max=prefix[right];
            }
            sum=Math.max(max,sum);
        }
        ans.add(sum);
    }

        for(int p=0;p<t;p++){
            System.out.println(ans.get(p));
        }
    }
}
