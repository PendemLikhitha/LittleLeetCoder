class Solution {
    public int getLucky(String s, int k) {
        String num = "";
        for(char c:s.toCharArray()){
            num+=Integer.toString(c-'a'+1);
        }
        while(k-->0){
          int sum = 0;
          for(char digit:num.toCharArray()){
            sum += digit-'0';
          }
          if(sum<10){
            return sum;
          }
          num = Integer.toString(sum);
        }
        return Integer.parseInt(num);
    }
}