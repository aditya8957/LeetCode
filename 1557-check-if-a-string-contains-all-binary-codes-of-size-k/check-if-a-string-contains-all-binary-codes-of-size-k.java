class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length();
        int i=0; int j = 0;
        HashSet<String> st = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        while(j<n){
            sb.append(s.charAt(j));
            if(j-i+1 == k){
                st.add(sb.toString());
                sb.deleteCharAt(0);
                i++;
            }
            j++;
        }
        return st.size() == Math.pow(2,k);
    }
}