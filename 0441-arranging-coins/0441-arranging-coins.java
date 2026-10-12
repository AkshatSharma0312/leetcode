class Solution {
    public int sqrt(int n) {
        if (n == 0) return 0;

        int l = 1, h = n;
        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (mid <= n / mid) l = mid + 1;
            else h = mid - 1;
        }
        return h;
    }

    public int arrangeCoins(int n) {
        return (int)((Math.sqrt(8L * n + 1) - 1) / 2);
    }
}
