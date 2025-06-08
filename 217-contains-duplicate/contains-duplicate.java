class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
            if(h.get(i)>1){
                return true;
            }
        }
        return false;
        
    }
}