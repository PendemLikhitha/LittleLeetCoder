class Solution {
    public int lengthOfLastWord(String s) {
        String res[] = s.split("[\\s]+");
        int n = res.length;
        return res[n-1].length();
    }
}