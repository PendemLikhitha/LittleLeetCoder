class Solution {
    public String reverseWords(String s) {
        String[] ss = s.trim().split("\\s+");
        int n = ss.length;
        for(int i=0;i<n/2;i++){
            String temp = ss[i];
            ss[i] = ss[n-i-1];
            ss[n-1-i] = temp;

        }
        return String.join(" ",ss);
    }
}