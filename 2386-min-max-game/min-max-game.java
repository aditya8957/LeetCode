class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
    
        while(n > 1){
            int[] temp = new int[n/2];
            for(int i=0; i<n/2; i++){
                if(i%2 == 0){
                    temp[i] = Math.min(nums[2*i], nums[2*i+1]);
                }
                else{
                    temp[i] = Math.max(nums[2*i], nums[2*i+1]);
                }
            }
            nums = Arrays.copyOf(temp, temp.length);
            n = nums.length;
        }
        return nums[0];
    }
}