class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> unique = new HashMap<>();
        int result = 0;
        int i = 0;
        for(int j = 0; j<fruits.length; j++) {
            unique.put(fruits[j], unique.getOrDefault(fruits[j],0)+1);
            while(unique.size() > 2) {
                unique.put(fruits[i],unique.get(fruits[i])-1);
                if(unique.get(fruits[i]) == 0) {
                    unique.remove(fruits[i]);
                }
                i++;
            }
            result = Math.max(result, j-i+1);
        }
        
        return result;
    }
}