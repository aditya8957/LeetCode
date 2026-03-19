class Solution {

    public int find(int idx,int amt,int[] coins,int[][] dp){
        if(amt == 0) return 1;
        if(idx<0) return 0;

        if(dp[idx][amt] != -1) return dp[idx][amt];

        if(coins[idx] > amt){
            return dp[idx][amt] = find(idx-1,amt,coins,dp);
        }
        else{
            return dp[idx][amt] = find(idx,amt-coins[idx],coins,dp)+find(idx-1,amt,coins,dp);
        }
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        for (int i = 0; i <= n; i++) {
             Arrays.fill(dp[i], -1);
        }
        return find(n-1,amount,coins,dp);
    }
}