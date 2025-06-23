class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small = nums[0];
        int large = nums[nums.length-1];
        int n = 1;
        while(n!=0){
            n = large % small;
            if(n!=0){
                large = small;
                small = n;
            }
        }
        return small;
    }
}