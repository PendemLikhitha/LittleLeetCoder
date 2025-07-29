class Solution {
    public int pivotIndex(int[] nums) {
        int sumr = 0,suml = 0;
        for(int i:nums){

            sumr+=i;
        }
        for(int i = 0;i<nums.length; i++){
            sumr -= nums[i];
            if(sumr == suml){
                return i;
            }
            suml += nums[i];
        }
        return -1;
        
    }
}