class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);

        System.out.print(s);
        int i=0;
        int j = 1;
        int max = 0;
        while(j<s.length()){
            int len = 0;
            if(s.charAt(j) == '1'){
                len = j-i;
                max = Math.max(max,len);
                i=j;
                j++;
            }
            else{
                j++;
            }
           
        }
        return max;
    }
}