package dataStructure;
import chapter2.Node;

public class CircularLinkedList {

	/**
	 * @param args
	 */
	public Node first=null;
	public Node current = null;
	
	public CircularLinkedList(){
		
	}
	
	public CircularLinkedList(int d){
		Node n = new Node(d);
		first = n;
		first.next = first;
		current = first;
	}
	
	public void insert(int d){
		Node n = new Node(d);
		if(first == null){	
			first = n;
			first.next = first;
			current = first;
		}
		else{
			current.next = n;
			current = n;
			current.next = first;
		}
	}
	
	public boolean isClear(){
		return first==null;
	}
	
	public void delete(){
		//
		if(current==first){
			first=null;
			current=null;
		}
		else{
			current.next = first.next;
			first = first.next;
		}
	}
	
	public  void print(int iterator){
		if (isClear()) System.out.println("None node in circle linked list.");
		else{
		Node point = new Node(0);
		point = first;
		for(int i =0; i<iterator; i++){
			System.out.print(point.data+"->");
			point = point.next;
		}
		System.out.println(point.data);
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList list = new CircularLinkedList(0);
		for (int i=0; i<5; i++){
			list.insert(i);
		}
		list.print(20);
		for (int i=0; i<7 ;i++){
			list.delete();
			list.print(20);
		}
//		list.delete();
		
		
	}

}
