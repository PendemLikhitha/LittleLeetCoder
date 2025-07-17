class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int res = 0;
        HashSet<Character> h = new HashSet<>();
        while(j < s.length()){
            char ch = s.charAt(j);
            if(!h.contains(ch)){
                j++;
                h.add(ch);
                res = Math.max(j-i,res);
            }
            else{
                h.remove(s.charAt(i));
                i++;
            }
        }
        return res;
    }
}