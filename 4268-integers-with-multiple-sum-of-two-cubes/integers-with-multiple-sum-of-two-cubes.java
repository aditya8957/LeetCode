class Solution {
    public List<Integer> findGoodIntegers(int n) {
        
        List<Integer> list = new ArrayList<>();
        Map<Long,Integer> mp = new HashMap<>();
        int limit = (int)Math.cbrt(n);

        for(int a=1; a<=limit; a++){
            for(int b=a; b<=limit; b++){

                long temp = (long)(a*a*a) + (long)(b*b*b);
                
                if(temp <= n){
                    mp.put(temp, mp.getOrDefault(temp, 0) + 1);

                    if(mp.get(temp) == 2){
                        list.add((int)temp);
                    }
                }
                
            }
        }
        Collections.sort(list);
        return list;
    }
}