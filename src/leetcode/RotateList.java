package leetcode;
import chapter2.*;
public class RotateList {

	/**
	 * @param args
	 * Given a list, rotate the list to the right by k places, where k is non-negative.
For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.
	 */
	public Node rotateRight(Node head, int n) {
        // Start typing your Java solution below
       // DO NOT write main() function
       if (head == null) return null;
      
       Node latter = head, former = head;
       for (int i=0; i<n; i++){
           latter = latter.next;//go through from head to the nth node.
           if (latter== null) latter = head;//if n>list.length it will begin at head
       }
       //after iteration if the latter one is at begin of head again
       //there is no need to rotate the list.
       if (former == latter) return head;
      
       //a new pointer begin at the head, and then two pointer start together 
       //until the latter one to reach the end node.
       //Now the former one is on the nth from right.
       while(latter.next!=null){
           latter = latter.next;
           former = former.next;
       }
       //creating the new list.
       Node newHead = former.next;
       former.next = null;
       latter.next = head;
       return newHead;
      
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
