/*206. Reverse Linked List

Given the head of a singly linked list,
reverse the list, and return the reversed list.

*/

class ListNode {
    int val;
    ListNode next;

    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }

}

public class Solution {
    public ListNode reverseList(ListNode list){
        ListNode head = null;
        if(head == null || head.next == null){
            return null;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr.next != null){
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head.next = null;
        head = prev;

        return head;
    }

    
}
