class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if(n==1){
            if(target==nums[0]){
                 return 0;
            }        
        }
        int low = 0,high=n-1;
        int mid = 0;

        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}