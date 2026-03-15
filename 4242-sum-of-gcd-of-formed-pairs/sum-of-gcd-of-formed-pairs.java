class Solution {
    public long gcd(long a, long b){
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
    public long gcdSum(int[] nums) {
        long mx = 0;
        int n = nums.length;
        long[] pref = new long[n];
        for(int i=0; i<n; i++){
            mx = Math.max(mx, nums[i]);
            pref[i] = gcd(mx,nums[i]);
        }
        Arrays.sort(pref);
        long sum = 0;
        int i=0, j=n-1;
        while(i<j){
            sum += gcd(pref[j], pref[i]);
            i++;
            j--;
        }
        return sum;
    }
}