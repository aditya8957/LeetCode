class Solution {
        int[] parent;
    int[] rank;

    public int find(int node){
        if(node == parent[node]){
            return node;
        }
        return parent[node] = find(parent[node]);
    }

    public void union(int x, int y){
        int px = find(x);
        int py = find(y);

        if(px != py){
            if(rank[px]>rank[py]){
                parent[py] = px;
            }
            else if(rank[py]>rank[px]){
                parent[px] = py;
            }
            else{
                parent[py] = px;
                rank[px]++;
            }
        }
        
    }
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n-1) return -1; //since min edges requires is n-1
        parent = new int[n];
        rank = new int[n];

        for(int i=0; i<n; i++){
            parent[i] = i;
            rank[i] = 0;
        }
        int comp = n;

        for(int i=0; i<connections.length; i++){
            if(find(connections[i][0]) != find(connections[i][1])){
                union(connections[i][0],connections[i][1]);
                comp--;
            }
        }
        return comp-1;
    }
}