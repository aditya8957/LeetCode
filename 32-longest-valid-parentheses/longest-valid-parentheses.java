class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int n = s.length();

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                st.add(i);
            }
            else{
                if(!st.isEmpty() && s.charAt(st.peek()) == '('){
                    st.pop();
                }
                else{
                    st.add(i);
                }
            }
        }
      
        // if(st.isEmpty()){
        //     return n;
        // }
        int len = 0;
        int maxLen = 0;

        while(!st.isEmpty()){
            len = n-st.peek()-1;
            maxLen = Math.max(maxLen, len);
            n = st.peek();
            st.pop();
        }
        return Math.max(n,maxLen);
    }
}