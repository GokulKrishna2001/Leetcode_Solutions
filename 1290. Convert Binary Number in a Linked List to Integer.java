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
    public int getDecimalValue(ListNode head) {
        ListNode current=head;
        int length=0;
        while(current!=null)
        {
            length++;
            current=current.next;
        }
        current=head;
        int sum=0;
        while(current!=null)
        {
            if(current.val==1)
                sum+=Math.pow(2,length-1);
            length--;
            current=current.next;
        }
        return sum;
    }
}
