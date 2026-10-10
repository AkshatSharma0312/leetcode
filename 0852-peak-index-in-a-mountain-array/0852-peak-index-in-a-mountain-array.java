class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=1,h=arr.length - 2;
        int mid=0;
        while(l<=h){
            mid=(l+h)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]&& arr[mid]<arr[mid+1]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        } 
        return 9999999;  
    }
}