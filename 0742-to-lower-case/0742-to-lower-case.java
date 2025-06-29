class Solution {
    public String toLowerCase(String s) {
        StringBuilder res = new StringBuilder();
        for(char i : s.toCharArray()){
            if(i >= 'A' && i <= 'Z'){
                res.append((char)(i+32));
            }
            else{
                res.append(i);
            }
        }
        return res.toString();
    }
}