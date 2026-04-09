class Solution {
    class Pair {
        int first;
        int sec;

        Pair(int first, int sec) {
            this.first = first;
            this.sec = sec;
        }
    }

    public void bfs(char[][] grid, int row, int col){
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        grid[row][col] = '0';

        while(!q.isEmpty()){
            int r = q.peek().first;
            int c= q.peek().sec;
            q.remove();

            for(int drow=-1; drow<=1; drow++){
                for(int dcol=-1; dcol<=1; dcol++){

                    if(Math.abs(drow) == Math.abs(dcol)) continue;

                    int nrow = r+drow;
                    int ncol = c+dcol;

                    if(nrow>=0 && ncol>=0 && nrow<grid.length && ncol<grid[0].length &&
                    grid[nrow][ncol] == '1'){

                        if(grid[nrow][ncol] == '1'){
                            q.add(new Pair(nrow, ncol));
                            grid[nrow][ncol] = '0';
                        }
                    }
                    
                }
            }
        }

    }

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    bfs(grid, i, j);
                }
            }
        }
        return count;
    }
}