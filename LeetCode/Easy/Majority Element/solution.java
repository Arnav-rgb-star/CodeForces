class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int majority=0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(cnt==0){
                ++cnt;
                majority=nums[i];
            }else if(majority!=nums[i]){
                --cnt;
            }else ++cnt;
        }
        return majority;
    }
}