class Pair {
    int row;
    int col;
    int val;

    Pair(int row, int col, int val) {
        this.row = row;
        this.col = col;
        this.val = val;
    }
}
class Solution {
    public int[][] colorGrid(int n, int m, int[][] sources) {
        Queue<Pair> q= new LinkedList<>();
        Arrays.sort(sources, (a,b)-> b[2]-a[2]);
        int[][] mat = new int[n][m];
        for(int i=0; i<sources.length; i++){
            int r = sources[i][0];
            int c = sources[i][1];
            int v = sources[i][2];
            mat[r][c] = v;
            q.add(new Pair(r,c,v));
        }
        int[] rows = {-1, 0, 1, 0};
        int[] cols = {0, 1, 0, -1};

        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int v = q.peek().val;

            q.remove();

            for(int i=0; i<4; i++){
                int nrow = r+rows[i];
                int ncol = c+cols[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && mat[nrow][ncol] == 0){
                    mat[nrow][ncol] = v;
                    q.add(new Pair(nrow,ncol,v));
                }

            }
        }
        return mat;
    }
}