package chapter3;
import java.util.*;
import dataStructure.MyStack;

public class SetOfStacks {

	/** 3.3
	 * @param args
	 * Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
	 * Therefore, in real life, we would likely start a new stack when the previous stack
	 * exceeds some threshold. Implement a data structure SetOfStacks that mimics this.
	 * SetOfStack should be compressed of several stacks and should create a new stack once
	 * the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop() should
	 * behave identically to a single stack(that is ,pop() should return the same values as
	 * it would if there were just a single stack).
	 * FOLLOW UP
	 * Implement a function popAt(int index) which performs a pop operation on a specific sub-stack
	 */
	
	ArrayList<MyStack> setStack = new ArrayList<MyStack>();
	private int capacity = 5;
	
	public SetOfStacks(){
		MyStack n = new MyStack();
		setStack.add(n);
	}
	
	public void push(int data){
		MyStack last = setStack.get(setStack.size()-1);
		if(last.isFull(capacity)){
			MyStack n_stack = new MyStack();
			setStack.add(n_stack);
			n_stack.push(data,capacity);
		}
		else{
			last.push(data, capacity);
		}

	}
	
	public int pop(){
		MyStack last = setStack.get(setStack.size()-1);
		int data = last.pop();
		if (last.isEmpty()) setStack.remove(setStack.size()-1);
		return data;
	}
	
	public void print(){
		if(setStack.isEmpty()){
			System.out.println("Set Of Stack is no node.");
		}
		for (MyStack s:setStack){
			s.print();
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetOfStacks set = new SetOfStacks();
		for (int i=0; i<10; i++){
			set.push(i);
		}
		set.print();
		for (int i=0; i<10;i++){
			set.pop();
		}
		set.print();
	}

}
