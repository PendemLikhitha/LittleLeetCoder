class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> arr1 =new HashMap<String,Integer>();
        HashMap<String,Integer> arr2 =new HashMap<String,Integer>();
        for(String a:words1){
            arr1.put(a,arr1.getOrDefault(a,0)+1);
        }

        for(String a:words2){
            arr2.put(a,arr2.getOrDefault(a,0)+1);
        }
        int res = 0;
        for(String key:arr1.keySet()){
            if(arr1.get(key)==1 && arr2.getOrDefault(key,0)==1){
            res++;
            }
        }
        return res;
    }
}