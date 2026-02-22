class Solution {
    public int scoreDifference(int[] nums) {
        boolean first = true;
        boolean sec = false;
        int f = 0;
        int s = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 != 0){
                first = !first;
                sec = !sec;
            }
            if((i+1)%6 == 0){
                first = !first;
                sec = !sec;
            }
            if(first){
                f += nums[i];
            }
            else if(sec){
                s += nums[i];
            }
        
        }
        return f-s;
    }
}