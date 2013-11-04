package Interview;
import chapter2.Node;
import dataStructure.CircularLinkedList;

public class DectectLoop {

	/**
	 * @param args
	 * Dectect a Linked list if it have a loop.
	 * classical algorithm for detect if a linked list 
	 */
	
	
	public static boolean hasLoop(Node list){
		if (list == null) return false;
		Node slower , faster;
		slower = faster = list;
		while(faster.next!= null){
			slower = slower.next;
			if (faster.next.next == null) return false;
			faster = faster.next .next;
			if (slower == faster ) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node list = new Node(8);
//		list.appendToTail(9);
//		list.appendToTail(7);
//		list.next .next = list;
	
//		Node.printNode(list);
		System.out.println();
		boolean flag = hasLoop(list);
		System.out.println(flag);
		
		CircularLinkedList clist = new CircularLinkedList();
		for(int i=0; i<5; i++){
			clist.insert(i);
		}
		clist.print(10);
		flag = hasLoop(clist.first);
		System.out.println(flag);
		
	}

}
