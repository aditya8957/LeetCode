class Solution {
    public boolean judgeCircle(String moves) {
        int left = 0;
        int up = 0;
        int n = moves.length();
        for(int i=0; i<n; i++){
            if(moves.charAt(i) == 'U') up++;
            else if(moves.charAt(i) == 'D') up--;
            else if(moves.charAt(i) == 'L') left++;
            else left--;
        }
            return left == 0 && up == 0;
    }
}