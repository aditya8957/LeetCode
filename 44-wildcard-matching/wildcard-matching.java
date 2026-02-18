class Solution {


    public int find(int i, int j, String s1, String s2, int[][] dp){

        if(i<0 && j<0) return 1;
        if(i<0 && j >= 0) return 0;

        if(j<0 && i>=0){
            for(int k=0; k<=i; k++){
                if(s1.charAt(k) != '*'){
                    return 0;
                }
            }
            return 1;
        }
        if(dp[i][j] != -1) return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j) || s1.charAt(i) == '?'){
            return dp[i][j] = find(i-1,j-1,s1,s2,dp);
        }
        if(s1.charAt(i) == '*'){
            return dp[i][j] = (find(i,j-1,s1,s2,dp) == 1 || find(i-1,j,s1,s2,dp) == 1)?1:0;
        }
        return dp[i][j] = 0;
    }
    public boolean isMatch(String s, String p) {
        String temp = s;
        s = p;
        p = temp;

        int n = s.length();
        int m = p.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0; i<=n; i++){
            Arrays.fill(dp[i],-1);
        }
        return find(n-1,m-1,s,p,dp) == 1;
    }
}













