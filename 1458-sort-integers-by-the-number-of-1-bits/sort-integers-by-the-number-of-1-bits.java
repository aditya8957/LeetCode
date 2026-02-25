class Solution {
    public int find(int n){
        int count = 0;
        while(n>0){
            if((n&1) == 1){
                count++;
            }
            n=n>>1;

        }
        return count;
    }
    public int[] sortByBits(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
    
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], find(arr[i]));
        }
     
        Integer[] temp = new Integer[arr.length];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp, (a, b) -> {
            if(map.get(a).equals(map.get(b))){
                return a - b;         
            }
            return map.get(a) - map.get(b); 
        });
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }
        
        return arr;
    }
}