class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        result[0]= binarySearch(nums,target,true);
        result[1] = binarySearch(nums,target,false);
        return result;
    }
    private int binarySearch(int[] nums,int target,boolean isSearchLeft){    
        int low = 0;
        int high = nums.length-1;
        int indx = -1;

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                indx = mid;
                if(isSearchLeft){
                    high = mid - 1;
                }
                else{
                    low = mid+1;
                }
               
            }
            else if(target>nums[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return indx;
    }
    
}