class Solution {
    public int numDifferentIntegers(String word) {
        String a = word.replaceAll("[^0-9]"," ");
        String c[] = a.trim().replaceAll("\\s+"," ").split(" ");
        HashSet<String> h = new HashSet<>();
        for(String i:c){
            if(!i.isEmpty()) {
                i = i.replaceFirst("^0+","");
            if(i.isEmpty()){
                i="0";
            }
            h.add(i);
            }
            
            
        }
        return h.size();
    }
}