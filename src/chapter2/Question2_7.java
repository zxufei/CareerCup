package chapter2;

public class Question2_7 {

	/**
	 * @param args
	 * Implement a function to detect if a linked list is a palindrome
	 */
	//reverse linked list using recursion and compare with original
	public static boolean isPalindrome(Node n){
		if (n==null) return false;
		Node reverse = reverseLinkedlist(n);
		
		Node.printNode(reverse);
		Node.printNode(n);
		
		return n.equals(reverse);
	}
	
	//reverse linked list using recursion
	public static Node reverseLinkedlist(Node n){
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
		
		Node result = reverseLinkedlist(n.next);
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
	
	
	
	//method 2 using recursion and compare
	public class Wrapper{
		Node node;
		boolean bool;
		Wrapper(Node node, boolean bool){
			this.node = node;
			this.bool = bool;
		}
	}
	
	public static Wrapper isPalindrome(Node head, Node cur){
		if (head==null){
			Question2_7 q = new Question2_7();
			return q.new Wrapper(head, false);
		}
		
		
		if(cur==null){
			Question2_7 q = new Question2_7();
			return q.new Wrapper(head, true);
		}
		
		Wrapper result = isPalindrome(head, cur.next);
		if (result.bool==false){
			return result;
		}
		
		result.bool = result.node.data == cur.data;//head compare to recursion current
		result.node = result.node.next;
		return result;
	}
	
	
	//method 3 using stack and compare rest half.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node list = new Node(0);
		for (int i=1; i<3; i++){
			list.appendToTail(i);
		}
		list.appendToTail(1);
		list.appendToTail(0);
//		list.appendToTail(9);
		
		System.out.println(isPalindrome(list));
		
	}

}
