package chapter2;
/**
 * Create Node for the linked list
 * @author xufeizhao
 *
 */

public class Node {
	
	public Node next;
	public int data;
	
	//Constructor function
	public Node(){
		data = 0;
		next = null;
	}	
	public Node(int d){
		data = d;
		next = null;
	}
	
	
	
	public void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		//find tail
		while (n.next!=null){
			n = n.next;
		}
		n.next = end;
		
	}
	
//	//delete all the node that is specific value
//	public Node deleteAllNode (int d){
//		Node point = this;//define a pointer at the head of linkedlist
//		
//		//the head of list is the node we want to delete
//		if (point.data == d){
//			return this.next;
//		}
//		
//		while(point.next != null){
//			if (point.data == d){
//				point.next = point.next.next;//delete
//				point = point.next;
//			}
//			else point = point.next;
//		}
//		return this;
//		
//	}
	
//	public Node deleteNode (Node head,int d){
//		Node point = head;
//		
//		if (point.data == d){
//			return head.next;
//		}
//		
//		while (point.next!=null){
//			if(point.next.data == d){
//				point.next = point.next.next;
//				return head;
//			}
//			point = point.next;
//		}
//		return head;
//	}
	
	
	public Node deleteNode (int d){
		Node point = this;
		
		while (point.data == d){
			this.data =this.next.data;
			this.next = this.next.next;
//			return this.next;//this is not modified
		}
		
		while (point.next!=null){
			if(point.next.data == d){
				point.next = point.next.next;
			}
			else point = point.next;
		}
		return this;
	}
	
	//print

	public static void printNode(Node head){
		Node n = head;
		while(n!=null){
			if(n.next != null){
			System.out.print(n.data+"->");
			n = n.next;
			}
			else{
				System.out.println(n.data);
				n=n.next;
			}
		}
		
	}
	
	public static void foo(Node n){
		n= n.next;
		n.next = n.next .next ;
	}
	
	
	public int length(){
		Node n = this;
		int count=0;
		while(n!=null){
			count++;
			n = n.next;
		}
		return count;
	}
	
	public boolean equals(Node n){
		Node n1 = this;
		if (n.length()!=n1.length()) return false;
		else{
			while(n!=null){
				if(n.data!=n1.data) return false;
				else {
					n = n.next;
					n1 = n1.next;
				}
			}
			return true;	
		}
		
	}
	
	
	
	//Test case main function
	public static void main(String args[]){
		Node list1 = new Node(1);
		for (int i=1; i<6; i++){
			list1.appendToTail(i);
			list1.appendToTail(i);
		}
		

//		printNode(list1);
//		foo(list1);
//		printNode(list1);
		
		Node list2 = new Node();
		list2 = list1.deleteNode(2);
		printNode(list2);
		printNode(list1);
	}
		
//		System.out.println(list1.length());

//		
//		Node list3 = new Node(4);
//		for(int i=1; i<6; i++){
//			list3.appendToTail(i);
//		}
//		printNode(list3);
//		System.out.println(list3.equals(list1));
//		
//	}


}
