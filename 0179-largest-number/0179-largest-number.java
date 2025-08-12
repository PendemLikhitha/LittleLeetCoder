class Solution {
    public String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for(int i = 0; i<nums.length; i++) {
            strNums[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(strNums,(a,b)->(b+a).compareTo(a+b));
        StringBuilder res = new StringBuilder();
        if(strNums[0].equals("0")){
            return "0";
        }
        for(String r:strNums) {
            res.append(r);
        }
        return res.toString();
    }
}