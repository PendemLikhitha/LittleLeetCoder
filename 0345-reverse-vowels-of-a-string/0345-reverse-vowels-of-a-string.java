class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int n = s.length();
        int j = n - 1;
        String vowels = "aeiouAEIOU";
        char arr[] = s.toCharArray();
        while(i<j){
            while(i<j && vowels.indexOf(arr[i])==-1){
                i++;
            }
            while(i<j && vowels.indexOf(arr[j])==-1){
                j--;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}