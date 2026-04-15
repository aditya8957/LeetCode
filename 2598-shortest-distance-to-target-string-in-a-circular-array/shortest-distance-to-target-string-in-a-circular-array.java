class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(words[i].equals(target)){
                int dist1 = Math.abs(i - startIndex);
                int dist2 = Math.abs(n-dist1);
                min = Math.min(min, Math.min(dist1,dist2));
            }
           
           
        }
        return min == Integer.MAX_VALUE? -1 : min;
    }
}