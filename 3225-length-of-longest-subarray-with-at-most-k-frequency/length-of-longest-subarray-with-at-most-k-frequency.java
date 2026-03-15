class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int max = 0;
        int i = 0;
        int j = 0;
        while(j<nums.length){
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
            
            while(mp.get(nums[j])>k){
                mp.put(nums[i],mp.getOrDefault(nums[i],0)-1);
                if(mp.get(nums[i]) == 0) mp.remove(nums[i]);
                i++;
            }
            max  = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}