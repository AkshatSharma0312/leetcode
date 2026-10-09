class Solution {
    public int[] shuffle(int[] nums, int n) {
        int splitIndex = n;
        int[] part1 = Arrays.copyOfRange(nums, 0, splitIndex);
        int[] part2 = Arrays.copyOfRange(nums, splitIndex, nums.length);
        int[] ans = new int[2 * n];
        int i = 0, j = 0, k = 0;
        while (i < part1.length && j < part2.length) {
            ans[k++] = part1[i++];
            ans[k++] = part2[j++];
        }
        return ans;
    }
}   