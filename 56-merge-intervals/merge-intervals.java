class Solution {
     public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        
        int n = intervals.length;
        int i =0;
        while(i<n && intervals[i][1]<newInterval[0]){
            ans.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        ans.add(new int[]{newInterval[0],newInterval[1]});
        while(i<n){
            ans.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }
        int res[][] = new int[ans.size()][2];
        for(int j =0;j<ans.size();j++){
            res[j][0] = ans.get(j)[0];
            res[j][1] = ans.get(j)[1];
        }
        return res;
    }
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b)->{
            if(a[0] != b[0]) return a[0]-b[0];
            return a[1]-b[1];
        });
        List<int[]> ans = new ArrayList<>();
        int n = intervals.length;

        for(int i=0; i<n; i++){
            if(ans.isEmpty() || ans.get(ans.size()-1)[1]<intervals[i][0]){
                ans.add(intervals[i]);
            }
            else{
                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1],  intervals[i][1]);
            }
        }

        int res[][] = new int[ans.size()][2];
        for(int j =0;j<ans.size();j++){
            res[j][0] = ans.get(j)[0];
            res[j][1] = ans.get(j)[1];
        }
        return res;
      

    }
}