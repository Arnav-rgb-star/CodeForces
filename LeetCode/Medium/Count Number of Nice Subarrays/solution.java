class Solution {
    int func(int nums[],int k){
        int l=0;
        int cnt=0;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>k){
                sum-=nums[l];
                ++l;
            }
            if(sum<=k) cnt+=(r-l+1);
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {

        for(int i=0;i<nums.length;i++) nums[i]%=2;
        return func(nums,k)-func(nums,k-1);
    }
}