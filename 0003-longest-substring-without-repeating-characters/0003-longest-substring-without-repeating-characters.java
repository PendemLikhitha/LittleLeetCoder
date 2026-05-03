class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int left = 0;
        HashMap<Character, Integer> m = new HashMap<>();
        for(int right = 0; right<s.length();right++){
            char ch = s.charAt(right);
            if(m.containsKey(ch)){
                left = Math.max(left, m.get(ch)+1);
            }
            m.put(ch,right);
            longest= Math.max(right - left + 1,longest);
        }
        return longest;
    }
}