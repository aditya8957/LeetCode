class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int st = Integer.MAX_VALUE;
        int end = 0;
        int ans = 0;
        int n = bloomDay.length;

        if(n<(long)m*k) return -1;

        for(int x : bloomDay){
            st  = Math.min(st,x);
            end = Math.max(end, x);
        }
        int cont = m*k;

        while(st<=end){
            int mid = st+(end-st)/2;

            int count = 0;
            int conseCount = 0;
            for(int i=0; i<n; i++){
                if(bloomDay[i] <= mid){
                    count++;
                }
                else{
                    count = 0;
                }
                if(count == k){
                    conseCount++;
                    count = 0;
                }
            }

            if(conseCount >= m){
                ans = mid;
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return ans;
    }
}                                                                                  