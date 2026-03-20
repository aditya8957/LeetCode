class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] ans = new int[n-k+1][m-k+1];
        for(int i=0; i<n-k+1; i++){
            for(int j=0; j<m-k+1; j++){
                Set<Integer> st = new HashSet<>();
                int min = Integer.MAX_VALUE;

                for(int x = i; x<i+k; x++){
                    for(int y = j; y<j+k; y++){
                        st.add(grid[x][y]);
                    }
                }
            
                List<Integer> list = new ArrayList<>(st);
                Collections.sort(list);
                for(int z = 1; z<list.size(); z++){
                    min = Math.min(min, list.get(z)-list.get(z-1));
                }
                if(list.size()<2) min = 0;
                ans[i][j] = min;
            }
        }
        return ans;
    }
}