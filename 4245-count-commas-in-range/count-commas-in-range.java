class Solution {
    public int countCommas(int n) {
        if(n>=1 && n<= 999) return 0;
        return n-999;
    }
}