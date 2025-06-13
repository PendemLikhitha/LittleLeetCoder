class Solution {
    public int countDigits(int num) {
        if(num<10){
            return 1;
        }
        int c = 0,n = num;
        while(n>0){
            int r = n%10;
            if(r!=0 && num%r==0){
                c++;
            }
            n/=10;
        }
        return c;
    }
}