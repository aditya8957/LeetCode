class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i<n; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        
        for(int freq:mp.values()){
            mp2.put(freq, mp2.getOrDefault(freq,0)+1);
        }
        int ans = -1;
        for(int freq : mp2.keySet()){
            if(mp2.get(freq) == 1){
                ans = freq;
                break;
            }
        }
        for(int i=0; i<n; i++){
            if(mp2.get(mp.get(nums[i])) == 1) return nums[i];
        }
        return -1;
    }
}