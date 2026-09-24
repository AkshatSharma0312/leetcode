import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int diff = 0;
        int ans = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                
                int sum = nums[i] + nums[l] + nums[r];
                int d = Math.abs(target - sum);

                if (diff == 0 || d < diff) {
                    diff = d;
                    ans = sum;
                }

                if (sum < target)
                    l++;
                else if (sum > target)
                    r--;
                else
                    return sum;
            }
        }

        return ans;
    }
}