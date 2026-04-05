class Solution {
    public int mirrorFrequency(String s) {
        int n = s.length();
        Map<Character,Integer> mp = new HashMap<>();

        for(int i=0; i<n; i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i),0)+1);
        }
        int count = 0;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(!mp.containsKey(ch)) continue;

            int x = mp.getOrDefault(ch, 0);
            
            mp.remove(ch);

            char res = 'a';

            if (ch >= 'a' && ch <= 'z') {
                res = (char)('a' + 'z' - ch);
            } else if (ch >= '0' && ch <= '9') {
                res = (char)('0' + '9' - ch);
            }

            int y = 0;
            if(mp.containsKey(res)){
                y = mp.getOrDefault(res, 0);
                mp.remove(res);
            } 
            count += Math.abs(x-y);
        }
        return count;
    }
}