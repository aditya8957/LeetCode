class Solution 
{
    public int findmax(int[][]mat,int mid)
    {
        int idx=0;
        int maxi=mat[0][mid];
        for(int i=1;i<mat.length;i++)
        {
            if(mat[i][mid]>maxi)
            {
                maxi=mat[i][mid];
                idx=i;
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) 
    {
        int n=mat.length;
        int m=mat[0].length;
        int l=0;
        int r=m-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int idx=findmax(mat,mid);
            int left=-1;
            int right=-1;
            if(mid-1>=0) left=mat[idx][mid-1];
            if(mid+1<m) right=mat[idx][mid+1];
            if(mat[idx][mid]>left&&mat[idx][mid]>right)
            {
                return new int[]{idx,mid};
            }
            else if(left>mat[idx][mid])
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}