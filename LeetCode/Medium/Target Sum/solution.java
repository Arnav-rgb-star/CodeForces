class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        int n = nums.length;
        for(int i=0;i<n;i++) sum+=nums[i];
        if (Math.abs(target)>sum) return 0;

        if ((sum+target)%2!=0) return 0;

        int req = (sum+target) / 2;

        int dp[][] = new int[n][req + 1];
        if(nums[0]==0) dp[0][0]=2;
        else{
            dp[0][0]=1;
            if(nums[0]<=req) dp[0][nums[0]]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=req;j++){
                int take=0;
                int notTake = dp[i-1][j];
                if(j>=nums[i]) take = dp[i-1][j-nums[i]];

                dp[i][j] = (take + notTake) ;
            }
        }
        return dp[n - 1][req];
    }
}