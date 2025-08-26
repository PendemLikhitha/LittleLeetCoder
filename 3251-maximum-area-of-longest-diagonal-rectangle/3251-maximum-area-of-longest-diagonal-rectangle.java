class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans = 0, max = 0;
        for(int[] dimen :dimensions) {
            int l = dimen[0], b = dimen[1];
            int d = l * l + b * b;
            if(d > max){
                max = d;
                ans = l * b;
            }
            else if( max == d){
                ans = Math.max(ans, l*b);
            }
        }
        return ans;
    }
}