# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if(head!=None):
            ptr1=head
            #ptr2=ptr1.next
            while(ptr1.next!=None):
                if(ptr1.val==ptr1.next.val):
                    ptr1.next=ptr1.next.next
                else:
                    ptr1=ptr1.next
        return head
