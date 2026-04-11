class Solution {
    public void isPrime(int n,boolean[] prime){
       
        for(int i=0; i<prime.length; i++){
            prime[i] = true;
        }

        for(int i=2; i*i<=n; i++){
            if(prime[i]){
                for(int j = i*i; j<=n; j+=i){
                    prime[j] = false;
                }
            }
            
        }
    }

    public int minOperations(int[] nums) {
        int count = 0;

        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max) max = nums[i];
        }

        int n = max + 10000; 

        boolean[] prime = new boolean[n+1];
        isPrime(n,prime);
        prime[0] = false;
        prime[1] = false;

        for(int i=0; i<nums.length; i++){

            int k = 0;

            if(i%2 == 0){
                while(!prime[nums[i]]){
                    nums[i]++;
                    k++;
                }
                count += k;
            }
            else{
                while(prime[nums[i]]){
                    nums[i]++;
                    k++;
                }
                count += k;
            }
        
        }
        return count;
    }
}