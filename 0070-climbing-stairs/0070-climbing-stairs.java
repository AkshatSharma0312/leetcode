class Solution {
    public int climbStairs(int n) {
        int i=1;
        int j=2;
        int count=0;
        if (n <= 2) return n;
        for (int z=3;z<=n;z++){
            count = i + j;
            i = j;
            j = count;
        }
        return count;
    }
}