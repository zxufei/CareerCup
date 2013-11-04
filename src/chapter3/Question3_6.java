package chapter3;
import dataStructure.MyStack;

public class Question3_6 {

	/**
	 * @param args
	 * Write a program to sort a stack in ascending order(with biggest items on top).
	 * You may use additional stacks to hold items, but you may not copy the elements
	 * into any other data structure(such as an array). The stack supports the following
	 * operations:push, pop, peak, and isEmpty.
	 */
	
	
	//method1
	public static MyStack sort(MyStack s){
		MyStack buffer = new MyStack();
		MyStack result = new MyStack();
		while(!(s.isEmpty() && buffer.isEmpty()) ){
			if(!s.isEmpty()){
				int min = s.pop();
				while(!s.isEmpty()){
					int temp = s.pop();
					if(temp < min){
						buffer.push(min);
						min = temp;
					}
					else{
						buffer.push(temp);
					}
			    }
				result.push(min);
			}
			if(!buffer.isEmpty()){
				int min = buffer.pop();
				while(!buffer.isEmpty()){
					int temp = buffer.pop();
					if(temp < min){
						s.push(min);
						min = temp;
					}
					else{
						s.push(temp);
					}
				}
				result.push(min);
			}
		}
		return result;
	}
	
	//method2
	public static MyStack sort2(MyStack s){
		MyStack result = new MyStack();
		while (!s.isEmpty()){
			int temp = s.pop();
			while(!result.isEmpty() && temp < (Integer)result.peek()){
				s.push(result.pop());
			}
			result.push(temp);
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack s = new MyStack();
		MyStack re = new MyStack();
		for(int i=6; i>0; i--){
			s.push(i);
		}
		
		s.push(9);
		s.push(2);
		s.push(0);
		s.print();
		re = sort2(s);
		
		re.print();
	}

}
