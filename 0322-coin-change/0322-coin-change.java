class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[] = new int[amount+1];
        for(int i = 0;i<=amount; i++){
            dp[i] = Integer.MAX_VALUE-1 ;
        }
        dp[0] = 0;
        for(int i = 1; i<=amount; i++){
            for(int j = 0; j<n; j++){
                if(coins[j]<=i){
                    if(dp[i-coins[j]]+1< dp[i]){
                        dp[i] = dp[i-coins[j]]+1;
                    }
                }
            }
        }
        return (dp[amount]==Integer.MAX_VALUE-1)?-1:dp[amount];
    }
}