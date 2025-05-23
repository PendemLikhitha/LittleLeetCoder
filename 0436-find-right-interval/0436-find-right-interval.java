class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[][] starts = new int[n][2];
        for(int i = 0;i<n;i++){
            starts[i][0] = intervals[i][0];
            starts[i][1] = i;
        }
        Arrays.sort(starts,(a,b)->Integer.compare(a[0],b[0]));
        int[] result = new int[n];
        for(int i=0 ;i<n;i++){
            int end = intervals[i][1];
            int idx = binarySearch(starts,end);
            result[i] = idx;
        }
        return result;
    }
    public int binarySearch(int[][] starts,int target){
        int low = 0;
        int high = starts.length-1;
        int res = -1;
        while(low<=high){
           int  mid = low+(high-low)/2;
            if(starts[mid][0]>=target){
                res = starts[mid][1];
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
}