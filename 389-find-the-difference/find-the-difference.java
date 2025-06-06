class Solution {
    public char findTheDifference(String s, String t) {
      int xor = 0;
      for(char a:s.toCharArray()){
        xor^=a;
      }  
      for(char b:t.toCharArray()){
        xor^=b;
      } 
      return (char)xor;
    }
}