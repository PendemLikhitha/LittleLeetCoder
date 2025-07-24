class Solution {
    public int minInsertions(String s) {
        int count = 0;
        int n = s.length();
        int open = 0;
        for(int i = 0;i<n; i++){
            char c = s.charAt(i);
            if(c == '('){
                open++;
            }
            else{
                if( i+1 < n && s.charAt(i+1)==')'){
                    if(open > 0){
                        open--;
                    }
                    else{
                        count++;
                    }
                    i++;
                }
                else{
                      if(open > 0){
                        open--;
                        count++;
                    }
                    else{
                        count+=2;
                    }
                    
                }
            }
        }
        return count + 2*open;
    }
}