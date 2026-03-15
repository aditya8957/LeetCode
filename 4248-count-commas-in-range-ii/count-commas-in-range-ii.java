class Solution {
    public long countCommas(long n) {
       long c = 0;
        long j = 1000;
        while(j<=n){
            c += n-j+1;
            j *= 1000;
        }
        return c;
    }
}