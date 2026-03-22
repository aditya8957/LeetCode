class Solution {
    public int solve(int idx, int[] nums, int tar, int n, int[][] dp){
        if(idx ==n ){
            if(tar == 0) return 0;
            return (int)1e9;
        }    
        if(dp[idx][tar] != -1) return dp[idx][tar];
        int take = 1 + solve(idx+1, nums,tar^nums[idx],n,dp);
        int notTake = solve(idx+1, nums,tar,n,dp);

        return dp[idx][tar] = Math.min(take,notTake);

    }
    public int minRemovals(int[] nums, int target) {
        int totalXor = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            totalXor ^= nums[i];
        }
        int removedXor = totalXor^target;

        int[][] dp = new int[n+1][16384]; 
         // 10000 ≈ 10011100010000 (14 bits) and2^14 = 16384

        for(int i=0; i<=n; i++){
            for(int j=0; j<16384; j++){
                dp[i][j] = -1;
            }
        }
        int ans = solve(0,nums,removedXor,n,dp);
        return ans >= (int)1e9?-1:ans;
    }
}