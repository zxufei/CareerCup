package chapter2;

public class Question2_3 {

	/**
	 * @param args
	 * Implement an algorithm to delete a node in the middle of a singly linkedlist
	 * given only access to that node
	 * 
	 */
	
	public static boolean deleteMiddle(Node middle){
		if(middle==null || middle.next==null){
			return false;
		}
		Node previous = middle;//copy that node
		middle.data = previous.next.data;
		middle.next = previous.next.next;
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create linked list
		Node list = new Node(1);
		for (int i=0; i<10; i++){
			int random = (int)(Math.random()*100);
			list.appendToTail(random);
		}
		
		//move node to what we want to delete
		int index = 7;
		Node middle = list;
		for (int i =0; i<index-1; i++){
			middle = middle.next;
		}
		Node.printNode(list);
		System.out.print(deleteMiddle(middle));
		System.out.println();
		Node.printNode(list);
		
	}

}
