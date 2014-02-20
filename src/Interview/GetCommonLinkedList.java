package Interview;
import java.util.HashSet;
import java.util.Set;

import chapter2.*;
public class GetCommonLinkedList {

	/**
	 * @param args
	 * tripAdvisor interview phone interview
	 * Given 2 linked list ,and return common int in these two list.
	 */
	public static Node both (Node list1, Node list2){
	       HashSet<Integer> app = new HashSet<Integer>();
	       while (list1 != null){
	           app.add(list1.data);
	           list1 = list1.next;
	       }
	       Node head = null,p=null;
	       while (list2 != null){
	           if ( find(app,list2.data) ) {
	           Node newn = new Node(list2.data);
	           if (head == null){
	               head = newn;
	               p = head;
	            }else{
	               p.next = newn;
	               p = p.next;
	           }
	           list2 = list2.next;
	          }
	       }
	       return head;
	           
	     }
	
	     public static boolean find(Set<Integer> arr ,int target){
	         for (int num:arr){
	             if (num == target) return true;
	         }
	         return false;
	     }
	      
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
