class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minSum = Integer.MAX_VALUE;
        HashMap<String,Integer> freq = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            freq.put(list1[i],freq.getOrDefault(list1[i],0)+i);
        }
        List<String> result = new ArrayList<>();
        for(int j = 0; j<list2.length; j++){
            if(freq.containsKey(list2[j])){
                int sum = j+freq.get(list2[j]);
                if(sum < minSum){
                    result.clear();
                    result.add(list2[j]);
                    minSum = sum;
                }
                else if(minSum == sum){
                    result.add(list2[j]);
                }
            }
        }
     return result.toArray(new String[0]);
    }
}