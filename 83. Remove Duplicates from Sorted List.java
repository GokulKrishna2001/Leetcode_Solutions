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
    public ListNode deleteDuplicates(ListNode head) {
        if(head!=null)
        {
            ListNode ptr1=head;
            ListNode ptr2=ptr1.next;
            while(ptr2!=null)
            {
                if(ptr2.val==ptr1.val)
                    ptr1.next=ptr2.next;
                else
                    ptr1=ptr1.next;
                ptr2=ptr2.next;
            }
        }
        return head;
    }
}
