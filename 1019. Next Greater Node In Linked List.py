# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
#works but time limit exceeded
class Solution:
    def nextLargerNodes(self, head: Optional[ListNode]) -> List[int]:
        list1=[]
        current=head
        while(current!=None):
            temp=current
            counter=0
            while(temp!=None):
                if(temp.val>current.val):
                    list1.append(temp.val)
                    counter=1
                    break
                else:
                    temp=temp.next
            if(counter==0):
                list1.append(0)
            current=current.next
        return list1
        
                
