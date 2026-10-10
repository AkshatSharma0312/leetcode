class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l=0, high=n-1;
        while(l<=high){
            int mid=(l+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
}