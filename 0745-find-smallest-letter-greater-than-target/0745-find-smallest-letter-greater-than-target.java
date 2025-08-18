class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0,high = letters.length - 1;
        int pos = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(letters[mid] > target) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        } 
        return letters[low % letters.length];
    }
}