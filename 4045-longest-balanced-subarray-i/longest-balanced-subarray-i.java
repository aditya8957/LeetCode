class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i=0; i<n; i++){
            HashSet<Integer> st1 = new HashSet<>();
            HashSet<Integer> st2 = new HashSet<>();

            for(int j=i; j<n; j++){
                if(nums[j]%2 == 0){
                    st1.add(nums[j]);
                }
                else{
                    st2.add(nums[j]);
                }

                if(st1.size() == st2.size()){
                    max = Math.max(max, j-i+1);
                }
            }
        }
        return max;
    }
}