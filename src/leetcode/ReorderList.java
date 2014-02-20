package leetcode;
import chapter2.*;
public class ReorderList {

	/**
	 * @param args
	 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
You must do this in-place without altering the nodes' values.
For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.
	 */
	
    public void reorderList(Node head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
    	
        //if there is null or one node list just return.
        if (head == null || head.next == null) return;
        //find the middle of linked list
        Node slow = head, fast = head;
        Node pre = new Node(0);//pre to record pre node of middle point
        pre.next = head;
        while(fast != null && fast.next != null){
            pre = pre.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;/*devide first half and second half list. 
        Second half always no shorter than first half.*/
        Node firstHalf = head;
        Node secondHalf = slow;
        //reverse secondHalf
        Node tmp = secondHalf;
        pre = null;
        while(secondHalf.next!=null){
            secondHalf = secondHalf.next;
            tmp.next = pre;
            pre = tmp;
            tmp = secondHalf;
        }
        secondHalf.next = pre;
        //insert second half to first half
        Node l1 = firstHalf, l2 = secondHalf;//l1 is no longer than l2.
        while(firstHalf!=null){
            secondHalf = secondHalf.next;
            l2.next = null;
            firstHalf = firstHalf.next;
            l1.next = l2;
            l2.next = firstHalf;
            l1 = firstHalf;
            if (firstHalf!=null) l2 = secondHalf;/*if l1/firstHalf refer to null. 
            the l2 must not assign to secondHalf which is the end of list. it must remain
            the position that is before last node .*/ 
        }
        l2.next = secondHalf;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
