class Solution {
    public int find(int i, int j, int[][] grid, int k,int n, int m, int[][][] dp){
         if (i >= n || j >= m || k < 0) return Integer.MIN_VALUE;

        if(i == n-1 && j == m-1){
            if(grid[i][j] == 0 ||   k>=1) return grid[i][j];
            else return Integer.MIN_VALUE;
        }

        if(dp[i][j][k] != -1) return dp[i][j][k];

        if(grid[i][j] == 0){
            return dp[i][j][k] =  Math.max(find(i+1,j,grid,k,n,m,dp),find(i,j+1,grid,k,n,m,dp));
        }
        else if(grid[i][j] == 1){
            int down = find(i+1,j,grid,k-1,n,m,dp);
            int right = find(i,j+1,grid,k-1,n,m,dp);

            if(down != Integer.MIN_VALUE) down = 1 + down;
            if(right != Integer.MIN_VALUE) right = 1 + right;

            return dp[i][j][k] =  Math.max(down, right);
        }
        else{
            int down = find(i+1,j,grid,k-1,n,m,dp);
            int right = find(i,j+1,grid,k-1,n,m,dp);

            if(down != Integer.MIN_VALUE) down = 2 + down;
            if(right != Integer.MIN_VALUE) right = 2 + right;

            return dp[i][j][k] =  Math.max(down, right);
        }
    }
    public int maxPathScore(int[][] grid, int k) {
        int n = grid.length;
        int m =  grid[0].length;
        int[][][] dp = new int[n][m][k+1];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        int ans = find(0,0,grid,k,n,m,dp);
        return ans == Integer.MIN_VALUE ? -1 : ans;
    }
}