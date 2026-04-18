class Solution {
    public int reverse(int n){
        int temp = n;
        int rev = 0;
        while(temp>0){
            int rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        return rev;
    }
    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }
}