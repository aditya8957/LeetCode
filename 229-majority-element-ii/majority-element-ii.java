class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int x : nums){
             freq.put(x, freq.getOrDefault(x,0)+1);
        }
        for(var e : freq.entrySet()){
            if(e.getValue() > n/3){
                ans.add(e.getKey());
            }
        }
       
        return ans;
    }
}