class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            int k = nums[i];
            if(k>0){
                ans[i] = nums[(i+k)%n];
            }
            else if(k<0){
                ans[i] = nums[((i+k)%n+n)%n];
            }
            else{
                ans[i] = nums[i];
            }
        }
        return ans;
    }
}