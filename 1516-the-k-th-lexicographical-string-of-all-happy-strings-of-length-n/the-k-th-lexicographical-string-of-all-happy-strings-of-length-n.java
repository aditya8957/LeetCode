class Solution {
    public void find(String s,int n, String temp, ArrayList<String> ans ){
        if(temp.length() == n){
            ans.add(temp);
            return;
        }

        for(int i=0; i<s.length(); i++){

            if(temp.length()>0 && temp.charAt(temp.length()-1) == s.charAt(i)) continue;

            find(s,n,temp+s.charAt(i),ans);
        }
    }
    public String getHappyString(int n, int k) {
        ArrayList<String> ans = new ArrayList<>();
        String s = "abc";
        String temp = "";
        find(s,n,temp,ans);
        if(k<=ans.size())
        return ans.get(k-1);
      
        return "";
    }
}