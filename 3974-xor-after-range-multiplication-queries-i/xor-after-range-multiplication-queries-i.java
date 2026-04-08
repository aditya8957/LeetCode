class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        long mod = 1000000007;
        for(int i=0; i<queries.length; i++){

            int idx = queries[i][0];
            int end = queries[i][1];
            int k = queries[i][2];
            int x = queries[i][3];

            for(int j = idx; j<=end; j +=k){
                nums[j] = (int)((1L * nums[j] * x) % mod);
            }
            
        }
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }
}