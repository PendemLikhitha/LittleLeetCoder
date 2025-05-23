class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        int left = s.length()-1;
        int right = left;
        while(left>=0){
            char l =s.charAt(left);
            char r = s.charAt(right);
            if(r==' '){
                left--;
                right--;
            }
            else if(left==0 || s.charAt(left-1)==' '){
                str.append(s.substring(left,right+1)).append(" ");
                left--;
                right = left;
            }
            else{
                left--;
            }
        }
        return str.toString().trim();
    }
}