package chapter2;
import java.util.*;
/**5th
 * Write code to remove duplicates from an unsorted linked list 
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 * @author xufeizhao
 *
 */


public class Question2_1 {

	/**
	 * @param args
	 */
	//Temporary buffer is not allowed
	//brute force no buffer in place, using built-in LinkedList, O(n^2)
	public static void removeDuplicate(LinkedList<Integer> list){
		if(list.isEmpty()) return;
		for (int i =0; i<list.size(); i++){
			int j = i + 1;//next index
			while(j<list.size()){
				if(list.get(i)==list.get(j))
					list.remove(j);
				else j++;
			}
		}
	}
	
	//buffer is not allowed, using user defined class node
	public static void removeDup3(Node n){
		if(n==null || n.next==null) return;
		Node first = n;
		while(first!=null){
			Node second = first;
			while(second.next!=null){
				if(first.data == second.next.data){
					second.next = second.next.next;
				}
				else second = second.next;
			}
			first = first.next;
				
		}
	}
	
	
	//using temporary buffer, using my Node class
	//When you delete a node in linkedlist you must have a pointer to record previous node
	public static void removeDup2(Node n){
		Hashtable<Integer, Boolean> table = new Hashtable<Integer,Boolean>();
		Node previous = null;
		while (n!=null){
			if (table.containsKey((Integer)n.data)){
				previous.next = n.next;//delete this node
			}
			else {
			table.put(n.data, true);
			previous = n;
			}
			n = n.next;		
		}
		
		
	}
	
	//using 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method1 test
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i =1; i<10; i++){
			list.add(i);
			list.add(i+1);
		}
		list.add(5);
		list.add(8);
		list.add(8);
		System.out.println(list);
		removeDuplicate(list);
		System.out.println(list);
		
		
		//Method2 test
		Node mylist = new Node(2);
		for (int i=2; i<6; i++){
			mylist.appendToTail(i);
			mylist.appendToTail(i);
		}
		Node.printNode(mylist);
		removeDup3(mylist);
		Node.printNode(mylist);

	}

}
