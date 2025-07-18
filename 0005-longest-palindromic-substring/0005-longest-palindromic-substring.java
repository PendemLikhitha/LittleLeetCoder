class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();

        if(n <= 1){
            return s;
        }
        int maxLen = 1;
        int start = 0;
        boolean dp[][] = new boolean[n][n];
        for(int i = 0; i < n-1; i++){
            dp[i][i] = true;
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                maxLen = 2;
                start = i;
            }
        }
        dp[n-1][n-1] = true;
        for(int len = 3; len <= n; len++){
            for(int i = 0; i< n-len+1;i++){
                int j = i + len - 1; 

                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                    dp[i][j]=true;
                    if(len>maxLen){
                        maxLen = len;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start,start+maxLen);
        
    }
}