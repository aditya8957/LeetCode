class Solution {
    public void dfs(int[][] grid, int r, int c, int col, int oldcolor){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c] != oldcolor) return;
        grid[r][c] = col;

        dfs(grid,r+1,c,col,oldcolor);
        dfs(grid,r-1,c,col,oldcolor);
        dfs(grid,r,c+1,col,oldcolor);
        dfs(grid,r,c-1,col,oldcolor);

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length; 
        int m = image[0].length;

        int oldcolor = image[sr][sc];

        if(oldcolor == color) return image;

        dfs(image, sr,sc, color,oldcolor);
        return image;

    }
}