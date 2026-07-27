class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int max2 = nums[nums.length - 2];
        return (max - 1) * (max2 - 1);
    }
}