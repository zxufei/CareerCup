package leetcode;
import chapter2.*;
public class RemoveDuplicatesFromSortedList {

	/**
	 * @param args
	Given a sorted linked list, delete all duplicates such that each element appear only once.
	For example,
	Given 1->1->2, return 1->2.
	Given 1->1->2->3->3, return 1->2->3.
	 */
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	
	public Node deleteDuplicates(Node head) {
	     // IMPORTANT: Please reset any member data you declared, as
	     // the same Solution instance will be reused for each test case.
		 if(head == null) return null;
	     Node point = head;
	     while (point.next != null){
	    	 if (point.next.data == point.data){
	    		 point.next = point.next.next;
	    	 }
	    	 else point = point.next;
	     }
	     return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
