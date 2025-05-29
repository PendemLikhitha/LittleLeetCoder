class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c_5 = 0;
        int c_10 = 0;
        int c_20 = 0;
        for(int i = 0;i<bills.length;i++){
            if(bills[i]==5){
                c_5++;
            }
            else if(bills[i]==10){
                if(c_5>0){
                    c_5--;
                    c_10++;
                }
                else{
                    return false;
                }
            }
            else{
                if(c_5>0 && c_10>0){
                    c_5--;
                    c_10--;
                    c_20++;
                }
                else if(c_5>=3){
                    c_5=c_5-3;
                    c_20++;
                }
                else {
                    return false;
                }
            }
        }
        return true;

    }
}