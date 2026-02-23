class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
    //     HashSet<Integer> st = new HashSet<>();
    //     Arrays.sort(nums);
    //     for(int i : nums)
    //      st.add(i);
    //      int max = 0;
    //      for(int num : nums){
    //         if(!st.contains(num-1)){ //num is startin point of a sequence
    //             int currNum = num; //1
    //             int currLen = 1;
    //             while(st.contains(currNum + 1)){
    //                currLen++;
    //                currNum++;
    //             }
    //             max = Math.max(max,currLen);

    //         }

    //      }

    //    return max>=k;

        int n = nums.length;
        if(n%k != 0) return false;

        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for(int x: nums){
            mp.put(x, mp.getOrDefault(x,0)+1);
        }
        while(mp.size() > 0){
            int st = mp.firstKey();
            int count = k;
            int curr = st;
            while(count-- > 0){
                if(!mp.containsKey(curr)){
                   return false;
                }
                if(mp.get(curr) == 1) {
                    mp.remove(curr);    
                } else {
                    mp.put(curr, mp.get(curr) - 1);
                }
                curr++;
            }

        }

        return true;

    }
}