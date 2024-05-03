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
    public int[] nextLargerNodes(ListNode head) {
        ListNode current=head;
        ListNode temp1,temp2;
        ArrayList<Integer> tempList = new ArrayList<>();
        int counter=0;
        while(current!=null)
        {
            counter++;
            tempList.add(current.val);
            current=current.next;
        }
        int[] arr=new int[counter];
        int i=0;
        if(counter==1)
        {
            arr[0]=0;
            return arr;
        }
        while(i<counter && counter>1)
        {
            int c=i;
            int a=tempList.get(i);
            int b=tempList.get(i);
            while(c<counter)
            {
                if(b>a)
                {
                    arr[i]=b;
                    break;
                }
                c++;
                if(c==counter)
                    arr[i]=0;
                else
                    b=tempList.get(c);
            }
            
            i++;
        }
        return arr;
    }
}
