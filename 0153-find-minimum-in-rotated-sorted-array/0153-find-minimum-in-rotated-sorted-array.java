class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        int index = -1;
        while(left <= right){
            int mid = (left +  right) / 2;
            if(nums[mid]<=nums[nums.length -1]){
                index = mid;
                right = mid -1;
            }
            else{
                left = mid +1;
            }
        }
        return nums[index];
    }
}