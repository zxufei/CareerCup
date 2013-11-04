package dataStructure;
import chapter2.Node;

public class MyStack {

	/**
	 * @param args
	 * using linked list to impelement a stack.
	 */
	
	public Node top;
	private int count = 0;
	
	public MyStack(){
		top=null;
	}
	public MyStack(int data){
		Node n = new Node(data);
		top = n;
		count++;
	}
	
	public int pop(){
		if(top!=null){
			int data = top.data;
			top = top.next;
			count--;
			return data;
		}
		else return  (Integer) null;
	}
	
	public void push(int data){
		Node n = new Node(data);
		n.next = top;
		top = n;
		count++;
	}
	
	//push of limited version stack
	public void push(int data, int capacity){
		if(count<capacity){
			Node n = new Node(data);
			n.next = top;
			top = n;
			count++;
		}
		else System.out.println("Stack is full.");
	}
	
	public Object peek(){
		if (top!=null)
		return top.data;
		else return null;
	}
	
	
	public boolean isEmpty(){
		return top == null;
	}
	
	
	public boolean isFull(int capacity){
		return count == capacity;
	}
	
	public void print(){
		Node.printNode(top);
	}
	
	
	public void clear(){
		while(top!=null){
			pop();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack s = new MyStack(4);
		for (int i=0; i<5; i++){
			s.push(i);
		}
		s.print();
		s.pop();
		s.pop();
		s.print();
		s.clear();
		s.print();

	}

}
