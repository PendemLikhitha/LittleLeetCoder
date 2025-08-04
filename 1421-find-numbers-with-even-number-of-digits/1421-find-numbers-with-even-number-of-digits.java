class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i: nums) {
            if(even(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num){
        int c = 0;
        while(num != 0){
            c++;
            num /= 10;
        }
        return c % 2 == 0;
    }
}