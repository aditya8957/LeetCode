class Solution {
    public int countBinarySubstrings(String s) {
        int n  = s.length();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n; i++){
            int c= 1;
            while(i<n-1 && s.charAt(i) == s.charAt(i+1)){
                c++;
                i++;
            }
           
            arr.add(c);
        }
         System.out.println(arr);
        int ans = 0;
        for(int i=0; i<arr.size()-1; i++){
            ans += Math.min(arr.get(i), arr.get(i+1));
        }
        return ans;
    }
}