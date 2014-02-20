package Interview;

import chapter2.Node;
import java.util.*;

public class ReverseLinkedList {

	/**
	 * @param args
	 */
	//reverse linked list using recursion
	public static Node reverseLinkedlistRe(Node n){
		if (n.next==null) {
			Node s = new Node(0);
			s.data = n.data;
			return s;
		}
		/**
		 * if(n.next==null) return n; //return the end node of n
		 * Node result = n 
		 * means result point to the end node of n.
		 * any later node next to result will be added to the end of n.
		 */
		
		Node result = reverseLinkedlistRe(n.next);
		//copy is the previous one before result;
		Node copy = new Node(0);
		copy.data = n.data;
		//make point head to the start of result
		Node resultHead = result;
		//loop result to the end
		while (result.next!=null){
			result = result.next;	
		}
		//make previous one next to the result
		result.next = copy;
		return resultHead;
	}
	
	//reverse linked list using stack
	public static Node reverseLinkedlistStack(Node n){
		Stack<Node> stack = new Stack<Node>();
		while(n!=null){
			Node singleNode = new Node(n.data);
			stack.push(singleNode);
			n = n.next;
		}
		
		//pop
		Node newn = stack.pop();
		Node point = newn;
		while(!stack.isEmpty()){
			point.next = stack.pop();
			point = point.next;
		}
		return newn;	
		
	}
	
	//just create a new linked list, not using stack, but require extra space.
	public static Node reverseLinkedlistGe(Node n){
		Node rl = null;
		while(n != null){
		    Node a = new Node(n.data);
			a.next = rl;
			rl = a;
			n = n.next;
		}
		return rl;
	}
	
	//Reverse a linked list  in-place, using node point to reverse
	public static Node reverseLinkedlistInplace(Node n){
		if (n == null) return n;
		Node pre = null;
		Node temp = n;// temp copy of n
		while (n.next != null){
			n = n.next;
			temp.next = pre;
			pre = temp;
			temp = n;
		}
		temp.next = pre;
		return n;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node list = new Node();
		for (int i =1; i<6; i++){
			list.appendToTail(i);
		}
		
		Node list2 = reverseLinkedlistInplace(list);
		Node.printNode(list);
		Node.printNode(list2);
		
		
	}

}
