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
    public boolean isPalindrome(ListNode head) {
        ListNode current=head;
        int length=0;
        List<Integer> intlist=new ArrayList<Integer>();
        while(current!=null)
        {
            intlist.add(current.val);
            length++;
            current=current.next;
        }
        int counter=1;
        for(int i=0;i<length/2;i++)
        {
            if(intlist.get(i)!=intlist.get(length-i-1))
            {
                counter=0;
                break;
            }
        }
        if(counter==1)
            return true;
        else
            return false;
    }
}
