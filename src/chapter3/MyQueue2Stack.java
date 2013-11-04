package chapter3;
import dataStructure.MyStack;

public class MyQueue2Stack {

	/**3.5
	 * @param args
	 * Implement a MyQueue class with implements a queue using two stacks.
	 */
	MyStack s1 = new MyStack();
	MyStack s2 = new MyStack();
	
	public MyQueue2Stack(){
		
	}
	
	public void enqueue(int data){
		s1.push(data);
	}
	
	//not very efficiency
	public int dequeue2(){
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		int data = s2.pop();
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
		return data;
	}
	
	//good
	public int dequeue(){
		if(!s2.isEmpty()){
			return s2.pop();
		}
		else{
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
			return s2.pop();
		}
	}
	
	public int peek(){
		int data = dequeue();
		s2.push(data);
		return data;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue2Stack q2s = new MyQueue2Stack();
		for(int i=0; i<6; i++){
			q2s.enqueue(i);
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		for (int i=0; i<4; i++){
			int data = q2s.dequeue();
			System.out.print(data+" ");
		}
		System.out.println();
		
		System.out.println(q2s.peek());
		System.out.println(q2s.peek());
		System.out.println(q2s.peek());
		

	}

}
