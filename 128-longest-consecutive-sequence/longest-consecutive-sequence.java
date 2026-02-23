class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int maxLen = 1;
        int currentLen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) continue;
                if (nums[i] == nums[i-1] + 1) {
                    currentLen++;
                    maxLen = Math.max(maxLen, currentLen);
                } else {
                    
                    currentLen = 1;
                }
            
        }
        return maxLen;
    }
}