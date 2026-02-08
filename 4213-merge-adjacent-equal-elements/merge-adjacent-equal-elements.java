class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st = new Stack<>();
        List<Long> ans = new ArrayList<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            long val = nums[i];
            while(!st.isEmpty() && st.peek() == val){
                st.pop();
                val = val*2;
            }
            st.add(val);
        }
        while(!st.isEmpty()){
            ans.add((long)st.pop());
        }
        Collections.reverse(ans);
        return ans;
    }
}