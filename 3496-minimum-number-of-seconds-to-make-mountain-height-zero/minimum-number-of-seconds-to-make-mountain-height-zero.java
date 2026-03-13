class Solution {
    public boolean check(long mid, int mh, int[] wt){
        long h = 0;

        for(int t:wt){
            h += (long)(Math.sqrt(2.0*mid/t+0.25) - 0.5);
            if(h>=mh) return true;
        }
        return h>=mh;
    }
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        int max = 0;
        for(int i =0; i<workerTimes.length; i++){
            max = Math.max(workerTimes[i], max);
        }
        long st = 0;
        long end = (long)max * ((long)mountainHeight * (mountainHeight + 1) / 2);
        long res = 0;

        while(st<= end){
            long mid = st+(end-st)/2;

            if(check(mid, mountainHeight, workerTimes)){
                res = mid;
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return res;
    }
}