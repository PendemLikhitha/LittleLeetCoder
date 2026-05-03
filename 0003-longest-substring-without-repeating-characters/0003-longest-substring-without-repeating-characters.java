class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int left = 0;
        HashMap<Character, Integer> m = new HashMap<>();
        for(int right = 0; right<s.length();right++){
            m.put(s.charAt(right),m.getOrDefault(s.charAt(right),0)+1);
            while(m.get(s.charAt(right))>1){
                 m.put(s.charAt(left),m.getOrDefault(s.charAt(left),0)-1);
                 left++;
            }
            longest= Math.max(right - left + 1,longest);
        }
        return longest;
    }
}