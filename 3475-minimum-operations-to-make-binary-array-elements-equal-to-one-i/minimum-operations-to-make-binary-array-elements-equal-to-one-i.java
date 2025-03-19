class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int op = 0;
        for(int i=0;i<n-2;i++){
            if(nums[i]==1){
                continue;
            }
            flipWindow(nums,i);
            op++;
        }
        if(nums[n-1]==0 || nums[n-2]==0){
            return -1;
        }
        return op;
    }
    public void flipWindow(int[] nums,int pos){
        nums[pos]^=1;
        nums[pos+1]^=1;
        nums[pos+2]^=1;
    }
}