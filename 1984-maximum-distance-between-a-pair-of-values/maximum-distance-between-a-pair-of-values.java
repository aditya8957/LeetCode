class Solution {
    public int binarySearch(int x, int[] nums, int st, int end) {
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] >= x) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }

    public int maxDistance(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int dist = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int j = binarySearch(nums1[i], nums2, i, m-1);
            if(j != -1)
                dist = Math.max(dist, j - i);
        }
        return dist == Integer.MIN_VALUE ? 0 : dist;
    }
}