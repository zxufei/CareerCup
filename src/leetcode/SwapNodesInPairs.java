package leetcode;
import chapter2.*;

public class SwapNodesInPairs {

	/**
	 * @param args
	 * Given a linked list, swap every two adjacent nodes and return its head.
For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. 
You may not modify the values in the list, only nodes itself can be changed.
	 */
    public static Node swapPairs(Node head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (head == null|| head.next == null) return head;//none or only one element in list
        
        Node newHead = head.next;
        Node first = head, third = head.next.next;
        while (third != null && third.next != null){//third != null must before third.next != null
            first.next.next = first;//second -> first
            first.next = third.next; //first -> forth
            first = third;
            third = first.next.next;
        }
        //complete last two elements
        first.next.next = first;
        first.next = third;
        return newHead;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node list = new Node(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(4);
		list.appendToTail(5);
//		list.appendToTail(6);
		Node.printNode(swapPairs(list));
	}

}
