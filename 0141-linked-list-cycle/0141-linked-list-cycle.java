/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
   if(head==null){
       return false;
   }
        
        ListNode temp = head;
        ListNode ptr = head.next;
        
        while(ptr!=null && ptr.next!=null){
            head=head.next;
            ptr=ptr.next.next;
            if(ptr==head){
                return true;
            }
        }
        
        return false;
        
        
        
    }
}