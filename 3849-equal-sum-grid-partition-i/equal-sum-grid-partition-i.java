class Solution {
    public boolean find(long tar, int[] arr){
        int n = arr.length;
        long sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(tar == 2*sum) return true;
        }
        return false;
    }
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[] h = new int[n*m];
        int[] v = new int[n*m];
        long tsum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                h[i] += grid[i][j];
                v[j] += grid[i][j];
                tsum += grid[i][j];
            }
        }
        return find(tsum, h) || find(tsum,v);
    }
}