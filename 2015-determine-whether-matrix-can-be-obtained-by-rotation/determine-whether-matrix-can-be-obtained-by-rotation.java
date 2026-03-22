class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int m = mat.length;
        int n = mat[0].length;
        int k = 4;
        while(k-- >0){   
            boolean flag = true;
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(mat[i][j] != target[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(!flag) break;
            }
            if(flag) return true;

            int[][] temp = new int[m][n];
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    temp[i][j] = mat[j][n-i-1];
                }
            }

            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    mat[i][j] = temp[i][j];
                }
            }
            
        }
        return false;
    }
}