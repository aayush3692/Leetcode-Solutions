/*
 * 83. Remove Duplicates from Sorted List
Given the head of a sorted linked list, delete all duplicates such 
that each element appears only once.
 Return the linked list sorted as well.
 */


class ListNode {

    int val;
    ListNode next;

    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
    
}

public class Solution{
    public ListNode deleteDuplicates(ListNode list1, ListNode list2){
        ListNode head = null;
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        while(temp != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }

}