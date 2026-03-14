class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        int count=0;
        int res = 0;
        while(n>0){
            int rem = n%2;
            res += Math.pow(2, count) * (rem == 1 ? 0 : 1);
            count++;
            n = n/2;
        }
        return res;
    }
}