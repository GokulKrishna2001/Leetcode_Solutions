# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        current=head
        list1=[]
        length=0
        counter=1
        while(current!=None):
            list1.append(current.val)
            current=current.next
            length=length+1
        for i in range(0,int(length/2)):
            if(list1[i]!=list1[length-1-i]):
                counter=0
                break
        if(counter==1):
            return True
        else:
            return False

