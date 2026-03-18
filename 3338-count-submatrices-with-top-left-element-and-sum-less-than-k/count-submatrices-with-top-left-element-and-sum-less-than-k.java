class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] pre = new int[n][m];
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(i == 0 && j == 0){
                    if(grid[i][j] <=k) count++;
                    continue;
                } 
                else if(i == 0) grid[i][j] += grid[i][j-1];
                else if(j == 0) grid[i][j] += grid[i-1][j];
                else{
                    grid[i][j] += grid[i][j-1] + grid[i-1][j] - grid[i-1][j-1];
                }
                if(grid[i][j] <=k) count++;
            }
        }
        return count;
    }
}