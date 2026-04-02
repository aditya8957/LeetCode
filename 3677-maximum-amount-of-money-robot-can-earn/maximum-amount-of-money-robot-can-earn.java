class Solution {
    int[][][] dp;
    public int find(int i, int j, int[][] arr,int k){

        if(i == 0 && j == 0){
            if(arr[i][j]<0 && k>0) return 0;
            return arr[i][j];
        }

        if(i<0 || j<0) return Integer.MIN_VALUE;

        if(dp[i][j][k] != Integer.MIN_VALUE) return dp[i][j][k];

        int take = arr[i][j] + Math.max(find(i,j-1,arr,k),find(i-1,j,arr,k));

        int skip = Integer.MIN_VALUE;

        if(k>0 && arr[i][j] <0){
            skip =  Math.max(find(i,j-1,arr,k-1),find(i-1,j,arr,k-1));
        }
        return dp[i][j][k] = Math.max(take,skip);
    }
    public int maximumAmount(int[][] coins) {
        int n = coins.length;
        int m = coins[0].length;

        dp = new int[n+1][m+1][3];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k < 3; k++) {
                    dp[i][j][k] = Integer.MIN_VALUE;
                }
            }
        }

        return find(n-1,m-1,coins,2);
    }
}