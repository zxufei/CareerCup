package leetcode;
import chapter2.*;
public class RemoveDuplicatesFromSortedListII {

	/**
	 * @param args
	 * Given a sorted linked list, delete all nodes that have duplicate numbers, 
	 * leaving only distinct numbers from the original list.
		For example,
		Given 1->2->3->3->4->4->5, return 1->2->5.
		Given 1->1->1->2->3, return 2->3.
	 */
	
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	       val = x;
	       next = null;
	     }
	 
	
	public ListNode deleteDuplicates(ListNode head) {
		    if (head == null) return null;
	        if (head.next == null) return head;
	        ListNode point = head;
	        int record = Integer.MIN_VALUE;
	        while(point.next!= null){
	            if (point.next.val == point.val){
	                point.next = point.next.next;//delete
	                record = point.val;
	            }
	            else if (point.val == record){
	                ListNode pre = findPre(head,point);
	                if (pre != null) {
	                    pre.next = point.next;
	                    point = pre.next;
	                }
	                else {
	                    head = point.next;
	                    point = point.next;
	                }
	            }
	            else {
	                point = point.next;
	            }
	        }
	        //delete last duplicate one
	        ListNode pre = findPre(head,point);
	        if (point.val == record){
	            if (pre != null) {
	                pre.next = point.next;
	                point = pre.next;
	            }
	            else return point.next;
	        }
	        return head;
	    }
	    
	  public ListNode findPre(ListNode head, ListNode node){
	        if (head == null) return null;
	        while(head.next!=null){
	            if (head.next.val == node.val){
	                return head;
	            }
	            else if (head.next.val < node.val){
	                head = head.next;
	            }
	            else return null;
	        }
	        return null;
	    } 
	        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
