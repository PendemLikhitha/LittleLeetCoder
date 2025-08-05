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
    public static int digits(int num)
    {
        return (int) (Math.log10(num)) + 1;
    }
    public static boolean even(int num){
        int a = digits(num);
        return a % 2 ==0;
    }
}