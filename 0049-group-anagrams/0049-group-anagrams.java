class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h = new HashMap<>();
        for(String s:strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String id = new String(charArr);
            if(!h.containsKey(id)){
                h.put(id, new ArrayList<>());
            }
            h.get(id).add(s);
        }
        return new ArrayList<>(h.values());
    }
}