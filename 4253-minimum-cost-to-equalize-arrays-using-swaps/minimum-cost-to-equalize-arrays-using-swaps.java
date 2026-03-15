class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();
        Map<Integer, Integer> mp3 = new HashMap<>();

        int n = nums1.length;
        for(int i=0; i<n; i++){
            mp1.put(nums1[i], mp1.getOrDefault(nums1[i],0)+1);
            mp2.put(nums2[i], mp2.getOrDefault(nums2[i],0)+1);
            mp3.put(nums1[i], mp3.getOrDefault(nums1[i],0)+1);
            mp3.put(nums2[i], mp3.getOrDefault(nums2[i],0)+1);
            
        }
        
        for(int val : mp3.values()){
           if(val%2 != 0) return -1;
        }
        
        int sum = 0;
        for(int key : mp3.keySet()){
            int val1 = mp1.getOrDefault(key,0);
            int val2 = mp2.getOrDefault(key,0);

            sum += Math.abs(val1 - val2);
        }
        return sum/4;
    }
}