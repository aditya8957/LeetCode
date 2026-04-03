class Solution {
    public class Row {
        int soldier;
        int idx;

        public Row(int soldier, int idx) {
            this.idx = idx;
            this.soldier = soldier;
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {

        PriorityQueue<Row> pq = new PriorityQueue<>((a, b) -> {
            if (a.soldier == b.soldier)
                return a.idx - b.idx;
            return a.soldier - b.soldier;
        });

        int[] ans = new int[k];
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                count += mat[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count, i));
        }
        for (int i = 0; i < k; i++) {
            ans[i] = pq.remove().idx;
        }
        return ans;
    }
}