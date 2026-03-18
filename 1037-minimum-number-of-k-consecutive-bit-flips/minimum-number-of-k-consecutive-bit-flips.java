class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        Queue<Integer> q = new LinkedList<>();
        int flip = 0;
        for(int i=0; i<n; i++){

            while(!q.isEmpty() && q.peek()<i){
                q.poll();
            }

            if((nums[i] == 0 && q.size()%2 == 0) || (nums[i] == 1 && q.size()%2 != 0)){

                if(i+k-1>=n) return -1;

                q.add(i+k-1);
                flip++;
            }
            
        }
        return flip;
    }
}