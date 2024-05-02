# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        current=head
        length=0
        while(current!=None):
            length=length+1
            current=current.next
        
        current=head
        number=0
        while(current!=None):
            if(current.val==1):
                number=number+(2 ** (length-1))
            length=length-1
            current=current.next
        return number    

        
