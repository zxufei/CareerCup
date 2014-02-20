package leetcode;
import chapter2.*;

public class RemoveNthNodeFromEndOfList {

	/**
	 * @param argGiven a linked list, remove the nth node from the end of list and return its head.
   Given linked list: 1->2->3->4->5, and n = 2.
   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
	 */
	
    public Node removeNthFromEnd(Node head, int n) {
        //if n is 0. Nothing would be deleted.
        if (n == 0) return head;
        
        Node first = head, second = head;
        for (int i=0; i<n; i++){
            second = second.next;
        }
        //if n is the length of list. We must delete first element.
        if (second == null) return head.next;
        
        //other situations
        while(second.next != null){
            first = first.next;
            second = second.next;
        }
        //delete
        first.next = first.next.next;
        return head;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
