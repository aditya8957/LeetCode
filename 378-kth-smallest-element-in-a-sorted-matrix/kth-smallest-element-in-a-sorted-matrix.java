class Solution {
    class Pair{
        int data;
        int row;
        int col;
        Pair(int data,int row, int col){
            this.data = data;
            this.row = row;
            this.col = col;
        } 
    }
    public int kthSmallest(int[][] matrix, int k) {
        // creating min heap
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

        int n = matrix.length;
          // Insert first row elements
        for (int j = 0; j < n; j++) {
            pq.offer(new Pair(matrix[0][j], 0, j));
        }

        int ans = 0;

        while (!pq.isEmpty() &&  k>0) {
            Pair temp = pq.poll();
            ans = temp.data;

            int i = temp.row;
            int j = temp.col;

            if (i + 1 < n) {
                pq.offer(new Pair(matrix[i + 1][j], i + 1, j));
            }
            k--;
        }

        return ans;

    }
}