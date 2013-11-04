package chapter2;

public class Question2_2 {

	/**
	 * @param 
	 * Implement an algorithm to find the kth to last element of a singly linked list
	 */
	public class WrapInt{
		public int value = 0;
		public WrapInt(){
			
		}
	}

	//recursion method
	public static Node nthtolast(Node head,int k, WrapInt i){
		if (head == null){
			return null;
		}
		Node node = nthtolast(head.next,k,i);
		i.value +=1;
		if(i.value == k) return head;
		else return node;
	}
	
	//non-recursion method O(n) time O(1)space
	public static Node nthtolast2(Node head,int k){
		if (k<=0) return null;
		Node first = head;
		Node second = head;
		for (int i =0; i<k-1; i++){
			if (second==null) return null;
			second = second.next;
		}
		//second iterate to the last node
		while (second.next!=null){
			first = first.next;
			second = second.next;
		}
		return first;
	}
	
	public static void main(String[] args) {
		//test methond2
		Node list = new Node(1);
		for (int i =0; i<10; i++){
			int random = (int)(Math.random()*100);
			list.appendToTail(random);
		}
		Node.printNode(list);
		Node last2 = nthtolast2(list,8);
		System.out.print(last2.data);
		System.out.println();
		
		//test method1
		Question2_2 q = new Question2_2();
		WrapInt wrapi = q.new WrapInt();//the WrapInt class is in Question2_2 class
		Node last = nthtolast(list,3,wrapi);
		System.out.print(last.data);
		
		// TODO Auto-generated method stub
		
		
	}

}


