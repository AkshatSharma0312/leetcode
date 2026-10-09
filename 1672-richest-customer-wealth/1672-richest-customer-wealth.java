class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] row : accounts) {
            int sum = 0;
            for (int v : row) {
                sum += v;
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }
}   