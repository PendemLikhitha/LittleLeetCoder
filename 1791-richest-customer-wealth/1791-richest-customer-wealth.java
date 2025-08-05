class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for(int col = 0; col < accounts[row].length; col++){
                sum += accounts[row][col];
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }
}