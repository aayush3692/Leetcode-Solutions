class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
class Solution(object):
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if(head == None):
            return None
        
        size = 0
        temp = head
        while(temp != None):
            temp = temp.next
            size = size + 1
        
        if(size == n):
            return head.next
        
        prev = head
        i = 1
        indexToSearch = size - n 
        while(i < indexToSearch):
            prev = prev.next
            i = i+ 1
        prev.next = prev.next.next
        
        return head