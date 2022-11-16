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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        
          ListNode temp = head;
        int i=1;
        while(temp.next!=null){
            temp=temp.next;
            i++;
        }
        
        k=k%i;
        
        while(k!=0){
            head=check(head);
            k--;
        }
        return head;
    }
    
    public ListNode check(ListNode head){
      
        ListNode temp = head;
        int i=1;
        while(temp.next!=null){
            temp=temp.next;
            i++;
        }
        temp.next = head;
        System.out.println(temp.val);
        i--;
        System.out.println(i);
        ListNode ptr = head;
        while(i!=0){
            ptr=head;
            head=head.next;
            i--;
        }
    
        ptr.next=null;
        
        return head;
    }
}