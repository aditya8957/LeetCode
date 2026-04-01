class Solution {
    public int find(int i, int j, int[] nums){
        if(i>j) return 0;

        if(i == j) return nums[i];

        int take_i = nums[i]-find(i+1,j,nums);
        int take_j = nums[j]-find(i,j-1,nums);

        return Math.max(take_i, take_j);
    }
    public boolean predictTheWinner(int[] nums) {
        int n= nums.length;
        return find(0,n-1,nums)>=0;
    }
}