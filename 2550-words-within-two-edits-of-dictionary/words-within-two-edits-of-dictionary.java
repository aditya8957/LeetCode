class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        int n = queries.length;
        int m = dictionary.length;
        List<String> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            String word = queries[i];
            for(int j=0; j<m; j++){
                String s = dictionary[j];
                int count = 0;
                for(int k=0; k<word.length(); k++){
                    if(word.charAt(k) != s.charAt(k)) count++;
                }
                if(count <=2){
                    ans.add(word);
                    break;
                }
            }
        }
        return ans;
    }
}