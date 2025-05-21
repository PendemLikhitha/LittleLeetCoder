class Solution {
    public int smallestEqual(int[] nums) {
        int minIndex = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            int n = nums[i];
            while(n>0){
                sum+=n%10;
                n=n/10;
            }
            if(sum==i%10){
                minIndex = Math.min(minIndex,i);
            }
        }
        return (minIndex==Integer.MAX_VALUE)?-1:minIndex; 
    }
}