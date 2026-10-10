
class Solution {
    public int maximumCount(int[] nums) {
        int l = 0, h = nums.length - 1;
        int c1 = 0, c2 = 0;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] < 0) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        c1 = l;

        l = 0;
        h = nums.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] <= 0) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        c2 = nums.length - l;

        return Math.max(c1, c2);
    }
}
