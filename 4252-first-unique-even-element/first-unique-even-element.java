class Solution {
    public int firstUniqueEven(int[] nums) {
        int[] count = new int[101];
        int n = nums.length;
        for(int i=0; i<n; i++){
            count[nums[i]]++;
        }
        for(int i=0; i<n; i++){
            if(nums[i]%2 == 0 && count[nums[i]] == 1){
                return nums[i];
            }
        }
        return -1;
    }
}