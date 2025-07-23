class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] stack = new int[nums2.length];
        HashMap<Integer,Integer> h = new HashMap<>();
        int index = 0;
        for(int num : nums2){
            while(index > 0 && stack[index-1] < num){
                h.put(stack[--index],num);
            }
            stack[index++] = num;
        }
        int n = nums1.length;
        for(int i = 0;i < n; i++){
            nums1[i] = h.getOrDefault(nums1[i],-1);
        }
        return nums1;
        
    }
}