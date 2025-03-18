class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0,maxLen = 0,bitWiseAND = 0;
        for(int right = 0;right<nums.length;right++){
            while((bitWiseAND & nums[right])!=0){
                bitWiseAND^=nums[left];
                left++;
            }
            bitWiseAND|=nums[right];
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}