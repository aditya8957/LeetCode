class Solution {
    public int[] singleNumber(int[] nums) {
        int r1 = 0;
        int n = nums.length;
        for(int i=0; i<nums.length; i++){
            r1 ^= nums[i];
        }
        int rm = r1&(-r1);
        int n1 = 0;
        for(int i = 0; i<n; i++){
            if((nums[i] & rm) != 0){
                n1 ^= nums[i]; 
            }
        }
        int n2 = r1^n1;

        int[] arr = {n1,n2};
        return arr;
    }
}