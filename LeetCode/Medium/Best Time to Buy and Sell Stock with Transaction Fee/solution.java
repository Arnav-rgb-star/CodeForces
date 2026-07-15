class Solution {
    int dp[][];
    int f(int n,int buy,int a[],int fee){

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                int profit;
                if(j==0) profit = Math.max(dp[i+1][1]-a[i] ,dp[i+1][0]);
                else profit = Math.max(dp[i+1][0]+a[i] - fee,dp[i+1][1]);
                dp[i][j] = profit;
            }
        }
        return dp[0][0];
    }
    public int maxProfit(int[] prices ,int fee) {
        dp = new int[prices.length+1][2];

        return f(prices.length,0,prices,fee);
    }
}