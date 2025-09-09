/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
       ListNode temp = head;
       int l =0;
       while(temp!=null){
          temp = temp.next;
          l++;
       } 
       for(int i=0;i<l/2;i++){
          head = head.next;
       }
       return head;
    }
}