class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int len = n * m;
        int mod = 12345;

        int[] arr = new int[len];
        int k = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[k++] = grid[i][j];
            }
        }

        int[] pref = new int[len];
        int[] suff = new int[len];

        pref[0] = arr[0] % mod;
        for(int i = 1; i < len; i++){
            pref[i] = (int)((1L * pref[i-1] * arr[i]) % mod);
        }

        suff[len-1] = arr[len-1] % mod;
        for(int i = len-2; i >= 0; i--){
            suff[i] = (int)((1L * suff[i+1] * arr[i]) % mod);
        }

        for(int i = 0; i < len; i++){
            long left = (i > 0) ? pref[i-1] : 1;
            long right = (i < len-1) ? suff[i+1] : 1;
            arr[i] = (int)((left * right) % mod);
        }

        k = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                grid[i][j] = arr[k++];
            }
        }

        return grid;
    }
}