class Solution {
    public int getLucky(String s, int k) {
       int curNum = 0;
       for(char c:s.toCharArray()){
        int position = c-'a'+1;
        while(position>0){
            curNum+=position%10;
            position/=10;
        }
       }
       for(int i=1;i<k;i++){
            int sum = 0;
            while(curNum>0){
                sum+=curNum%10;
                curNum/=10;
            }
            curNum = sum;
            if(curNum<10){
                break;
            }
       }
       return curNum;
    }
}