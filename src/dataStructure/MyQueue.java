package dataStructure;
import chapter2.Node;

public class MyQueue {

	/**
	 * @param args
	 */
	public Node first, last;
	
	public MyQueue(){
		first = null;
		last = null;
	}
	
	public MyQueue(int data){
		Node f = new Node(data);
		first = f;
		last = first;
	}
	
	public void enqueue(int data){
		if(last==null){
			first.data = data;
			last = first;
		}
		else{
			Node n = new Node(data);
			last.next = n;
			last = last.next;
		}
	}
	
	public int dequeue(){
		if(last== null) return (Integer)null;
		else{
			int result = first.data;
			first = first.next;
			return result;
		}
	}
	
	public  void print(){
		Node.printNode(first);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue que = new MyQueue(2);
		for(int i=0; i<6;i++){
			que.enqueue(i);
		}
		que.print();
		que.dequeue();
		que.dequeue();
		que.print();
		que.dequeue();
		que.dequeue();
		que.enqueue(10);
		que.enqueue(8);
		que.print();
		que.dequeue();
		que.dequeue();
		que.print();
		
		
	}

}
