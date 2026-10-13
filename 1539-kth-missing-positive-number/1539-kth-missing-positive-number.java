
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0, h = arr.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int correctno = mid + 1;
            int missing = arr[mid] - correctno;

            if (missing >= k) h = mid - 1;
            else l = mid + 1;
        }
        return l + k;
    }
}
