package chapter3;
import dataStructure.MyStack;
//import java.util.*;

public class MyStackMin extends MyStack{

	/**3.2
	 * @param args
	 * How would you design a stack which, in addition to push and pop,
	 * also has a function (min) which returns the minimum element?
	 * Push, pop and min should operate in O(1) time.
	 */
	
	MyStack s_min = new MyStack();
	
	public int min(){
		if(s_min.isEmpty()) return Integer.MAX_VALUE;
		else return  (Integer) s_min.peek();
	}
	
	
	
	public void push(int data){
		super.push(data);
		if(data < min()){
			s_min.push(data);
		}
	}
	
	public int pop(){
		int value = super.pop();
		if (value > min()){
		}
		else s_min.pop();
		return value;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStackMin s = new MyStackMin();
		for (int i=6; i>0; i--){
			int random = (int)(Math.random()*10);
			s.push(random);
		}
	
		try{
			s.print();
			System.out.println(s.min());
			s.pop();
			s.pop();
			s.pop();
			s.print();
			System.out.println(s.min());
			while(!s.isEmpty()){
			s.pop();
			s.print();
			System.out.println(s.min());
			}
		}catch(Exception e){
			System.out.println("no node.");
		}
		
		
	}

}
