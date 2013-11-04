package leetcode;
import chapter2.*;
public class LinkedListCycleII {

	/**
	 * @param args
		Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
		Follow up:
		Can you solve it without using extra space?
	 */
	/**
	 * Definition for singly-linked list.
	 * class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	
	public Node detectCycle(Node head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        Node slow = head, fast = head;
        if (head == null) return null;
        //first overlap
        while (fast.next != null){
            slow = slow.next;
            if (fast.next.next == null){
                return null;
            }
            else fast = fast.next.next;
            if (slow == fast) break;
        }
        //not cycle list
        if (fast.next == null) return null;
        //the begin looper at head
        if (fast == head) return head;
        //the begin not at head
        slow = head;
        while(true){
            slow = slow.next;
            fast = fast.next;
            if (slow == fast) return slow;
        }
        
    }   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
