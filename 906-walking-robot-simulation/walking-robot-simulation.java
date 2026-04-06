class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {

        HashSet<String> st = new HashSet<>();

        for(int i=0; i<obstacles.length; i++){
            String s = obstacles[i][0] + "_" + obstacles[i][1];
            st.add(s);
        }

        int n = commands.length;
        int[] dir = {0, 1};
        int x = 0;
        int y = 0;
        int maxDistance = 0;

        for(int i=0; i<n; i++){
            int move = commands[i];
            if(move == -1){ //right
                dir = new int[]{dir[1], -dir[0]};
            }
            else if(move == -2){ //left
                dir = new int[]{-dir[1], dir[0]};
            }
            else{
                for(int j=0; j<move; j++){
                    int newX = x + dir[0];
                    int newY = y + dir[1]; 
                    String temp = newX+"_"+newY;

                    if(st.contains(temp)){
                        break;
                    }
                    x = newX;
                    y = newY;
                }
            }
            maxDistance = Math.max(maxDistance, x * x + y * y);
        }
        return maxDistance;
    }
}