class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n = encodedText.length();
        int col = n/rows;
        char[][] s = new char[rows][col];
        int k = 0;

        for(int i =0; i<rows; i++){
            for(int j=0; j<col; j++){
                s[i][j] = encodedText.charAt(k);
                k++;
            }
        }
        StringBuilder temp = new StringBuilder();
        for(int c =0; c<col; c++){
            int i=0; 
            int j = c;
            while(i<rows && j<col){
                temp.append(s[i][j]);
                i++;
                j++;
            }
        }
        return temp.toString().stripTrailing();
    }
}