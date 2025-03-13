class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int pos = 0;
        int sum = 0;
        int diff[] = new int[n+1];
        for(int i=0;i<n;i++){
            while(sum+diff[i]<nums[i]){
                if(pos==queries.length){
                    return -1;
                }
                int start = queries[pos][0];
                int end =queries[pos][1];
                int inc = queries[pos][2];
                pos++;
                if(end<i) continue;
                diff[Math.max(start,i)]+=inc;
                if(end+1<n){
                    diff[end+1]-=inc;
                }
            }
            sum+=diff[i];
        }
        return pos;
    }
}