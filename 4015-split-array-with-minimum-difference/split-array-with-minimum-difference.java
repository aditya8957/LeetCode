class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        long lsum = 0, rsum = 0;
      
        while (l < n - 1 && nums[l] < nums[l + 1]) {
            lsum += nums[l];
            l++;
        }
     
        while (r > 0 && nums[r - 1] > nums[r]) {
            rsum += nums[r];
            r--;
        }
      
        if (l==r){
            long op1 = Math.abs((lsum + nums[l]) - rsum);
            long op2 = Math.abs(lsum - (rsum + nums[l]));
            return Math.min(op1, op2);
        }
        else if(nums[l] == nums[r] && r-l==1){
            return Math.abs(rsum-lsum);
        }
        return -1;
    }
}