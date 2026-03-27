class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int st = 0;
        int fuel = 0;
        int tot = 0;
        int tcost = 0;
        for(int i=0; i<n; i++){
            tot += gas[i];
            tcost += cost[i];
            fuel += gas[i]-cost[i];
            if(fuel<0){
                st = i+1;
                fuel = 0;
            }
            
        }
        
        if(tot<tcost) return -1;

        return st;
    }
}