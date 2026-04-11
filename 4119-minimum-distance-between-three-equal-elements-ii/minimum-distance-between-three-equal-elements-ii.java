class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(!mp1.containsKey(nums[i])){
                mp1.put(nums[i],i);
            }
            else if(!mp2.containsKey(nums[i])){
                mp2.put(nums[i], i);
            }
            else{
                int dist = Math.abs(mp1.get(nums[i])-mp2.get(nums[i])) +
                     Math.abs(mp2.get(nums[i])-i)+ Math.abs(i-mp1.get(nums[i]));
                min = Math.min(min,dist);

                mp1.put(nums[i], mp2.get(nums[i]));
                mp2.put(nums[i], i);
            }
        }
        return min == 2147483647?-1:min;
    }
}