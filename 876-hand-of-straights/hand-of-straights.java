class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int k = groupSize;
        int n = hand.length;
        if(n%k != 0) return false;

        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for(int x: hand){
            mp.put(x, mp.getOrDefault(x,0)+1);
        }
        while(mp.size() > 0){
            int st = mp.firstKey();
            int count = k;
            int curr = st;
            while(count-- > 0){
                if(!mp.containsKey(curr)){
                   return false;
                }
                if(mp.get(curr) == 1) {
                    mp.remove(curr);    
                } else {
                    mp.put(curr, mp.get(curr) - 1);
                }
                curr++;
            }

        }

        return true;
    }
}