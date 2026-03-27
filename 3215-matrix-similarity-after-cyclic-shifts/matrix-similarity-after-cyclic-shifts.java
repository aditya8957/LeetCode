class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        k = k%n;
        int[][] temp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                if(i%2 == 0){
                    temp[i][(j+(n-k))%n] = mat[i][j];
                }
                else{
                    temp[i][(j+k)%n] = mat[i][j];
                }
            } 
        }
     
        for(int i=0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(temp[i][j] != mat[i][j]) return false;
            }
        }
        return true;
    }
}