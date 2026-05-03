class Solution {
    public boolean rotateString(String s, String goal) {
       
        if(s.length() != goal.length()) return false;
        String temp = s+s;
        for(int i=0; i<s.length(); i++){
            int j=0;
            int k=i;
            while(k<temp.length() && j<goal.length() && temp.charAt(k) == goal.charAt(j)){
                k++;
                j++;
            }
            if(j == goal.length()) return true;
        }
        return false;
    }
}