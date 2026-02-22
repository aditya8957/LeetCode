class Solution {
    public boolean isDigitorialPermutation(int n) {
        int[] fact = {1,1,2,6,24,120, 720, 5040, 40320,362880};
        int l  = String.valueOf(n).length();
        int[] count = new int[10];

        long sum = 0;
        int temp = n;
        while(temp>0){
            int idx = temp%10;
            count[idx]++;
            sum += fact[idx];
            temp = temp/10;
        }
        System.out.print(sum);
        while(sum>0){
            int idx = (int)sum%10;
            count[idx]--;
            sum = sum/10;
        }
        for(int i=0; i<10; i++){
            if(count[i] != 0) return false;
        }
        
       

        return true;
    }
}