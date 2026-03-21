class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] ans = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ans[i][j] = grid[i][j];
            }
        }
    

        for(int i = x; i<(x+k); i++){
            for(int c = y; c<y+k; c++){
                int row =  x + (k - 1 - (i - x));
                ans[row][c] = grid[i][c];
            }
        }
    return ans;
    }
}