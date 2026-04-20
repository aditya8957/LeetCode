class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int i=0; int  j = n-1;
        int max = 0;
        while(i<j){
            if(colors[i] != colors[j]){
                max = j;
                break;
            };
            j--;
        }
        i = 0;
        j = n-1;
        while(i<j){
            if(colors[i] != colors[j]){
                max = Math.max(max, j-i);
                break;
            };
            i++;;
        }
        return max;
    }
}