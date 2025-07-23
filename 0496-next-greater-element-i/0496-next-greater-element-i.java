class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        int[] res = new int[nums1.length];
        for(int i = nums2.length-1; i >= 0; i--){
            while(!s.isEmpty() && nums2[i] >= s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                h.put(nums2[i],-1);
            }
            else{
                h.put(nums2[i], s.peek());
            }
           s.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            res[i] = h.get(nums1[i]);
        }
        return res;
    }
}