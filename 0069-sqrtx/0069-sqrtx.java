class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;
        int result = 0;
        int left = 1;
        int right = x/2;
        while(left<=right){
            int mid = (left + right)/2;
            if((long)mid*mid<=x){
                result = mid;
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
    return result;
    }
}