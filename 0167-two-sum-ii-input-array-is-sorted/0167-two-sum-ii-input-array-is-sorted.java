class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i =0,index=-1;
        for(i = 0;i<numbers.length-1;i++){
            int cur = target - numbers[i];
            index = binarySearch(i+1,cur,numbers);
            if(index!=-1){
               break;
            }
            
        }
          return new int[]{i+1,index+1};
    }
    private static int binarySearch(int start,int target,int[] numbers){
        int end = numbers.length - 1;
        while(start<=end){
            int mid = (start+ end)/2;
            if(numbers[mid]==target){
                return mid;
            }
            else if(numbers[mid]<target){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}