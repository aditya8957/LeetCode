class Solution {
    public boolean canBeEqual(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
         boolean f = false;
        for(int i=0; i<n; i++){
            f = false;
            for(int j =0; j<m; j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    if(Math.abs(i-j)%2 == 0){
                        f = true;
                        break;
                    }
                    
                }
            }
            if(!f) return false;

        }
        if(f) return true;
        return false;
    }
}