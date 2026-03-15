class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length() == 0) return 0;
        int[] mp = new int[26];
        
        for(int i=0; i<s.length(); i++){
            mp[s.charAt(i)-'a']++;
        }
        int max = 0;
        int i = 0;

        while(i<s.length() && mp[s.charAt(i)-'a']>=k) i++;

        if(i == s.length())return s.length();
       
        int left = longestSubstring(s.substring(0,i),k);
        int right = longestSubstring(s.substring(i+1),k);

        return Math.max(left,right);
    }
}