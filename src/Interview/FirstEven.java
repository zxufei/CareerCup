package Interview;
import chapter2.Node;

public class FirstEven {

	/**
	 * @param args
	 * 7->9->4->7
	 * return first even node
	 * 
	 * Follow up
	 * remove all odd
	 */
	
	public static Node findEven(Node list){
		if (list == null) return null;
		while(list!=null){
			if(list.data%2==0) return list;
			else list = list.next;
		}
		return null;
	}
	
	public static Node deleteOdd(Node list){
		if(list==null) return null;
		Node even=new Node(0);
		Node copy = even;
		while(list!= null){
			Node firsteven = findEven(list);
			copy.next = new Node(firsteven.data);
			copy = copy.next;
			list = firsteven.next;
		}
		return even.next;
	}
	
	//in-place
	public static Node deleteOdd2(Node list){
		list = findEven(list);
		Node n =list;
		while(list!=null){
			list.next = findEven(list.next);
			list = list.next;
		}
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node list = new Node(1);
		list.appendToTail(7);
		list.appendToTail(4);
		list.appendToTail(9);
		list.appendToTail(8);
		Node.printNode(list);
		Node even = findEven(list);
		Node.printNode(even);
		Node evenlist = deleteOdd2(list);
		Node.printNode(evenlist);
		
	}

}
