class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        boolean yes = true;
        for(int i:nums){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        for(int i :nums){
            if(count.get(i)%2!=0){
                yes = false;
            }
        }
        return yes;
    }
}