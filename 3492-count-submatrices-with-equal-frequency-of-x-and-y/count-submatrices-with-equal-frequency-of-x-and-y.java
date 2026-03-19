class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n = grid.length;
        int m  = grid[0].length;
        int mat[][] = new int[n][m];
        int[][] countX = new int[n][m];
        int idx1 = -1;
        int idx2 = -1;
        boolean flag = false;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 'X'){
                    mat[i][j] = 1;
                    countX[i][j] = 1;
                }
                else if(grid[i][j] == 'Y'){
                    mat[i][j] = -1;
                }
                else mat[i][j] = 0;
            }
        }

        int count = 0;

        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(i == 0 && j == 0){
                    continue;
                } 
                else if(i == 0){
                    mat[i][j] += mat[i][j-1];
                    countX[i][j] += countX[i][j-1];
                }
                else if(j == 0){
                    mat[i][j] += mat[i-1][j];
                    countX[i][j] += countX[i-1][j];
                }
                else{
                    mat[i][j] += mat[i][j-1] + mat[i-1][j] - mat[i-1][j-1];
                    countX[i][j] += countX[i][j-1] + countX[i-1][j] - countX[i-1][j-1];

                }
                
            }
        }
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                
                if(mat[i][j] == 0 && countX[i][j]>0) count++;

            }
        }
        return count;
    }
}