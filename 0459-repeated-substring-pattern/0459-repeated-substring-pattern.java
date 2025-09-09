class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i = 1;i<=n/2;i++){
            String str = s.substring(0,i);
            if(n%i==0){
                int count = n/i;
                String temp="";
                while(count>0){
                    temp+=str;
                    count--;
                }
                if(temp.equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}