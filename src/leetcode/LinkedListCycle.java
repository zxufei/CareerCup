package leetcode;
import chapter2.*;

public class LinkedListCycle {

	/**
	 * @param args
		Given a linked list, determine if it has a cycle in it.
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
	
	public boolean hasCycle(Node head) {
	   // IMPORTANT: Please reset any member data you declared, as
	   // the same Solution instance will be reused for each test case.
		  if (head == null) return false;
	        // if (head.next == null) return false;
	        Node slower, faster;
			slower = faster = head;
	       while (faster.next!=null){
			    slower = slower.next;
			    if(faster.next.next == null) return false;
			    else faster = faster.next.next;
			    if (slower == faster) return true;
			}
			return false;
	}    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
