package chapter2;

public class Question2_5 {

	/**
	 * @param args
	 * You have two numbers represented by a linked list, where each node contains
	 * a single digit. The digits are stored in reverse order, such that the 1's digit is 
	 * at the head of the list. Write a function that adds the two numbers
	 * and returns the sum as a linked list.
	 * example:
	 * list1:2->1->9 means 912
	 * list2:3->4->6 means 643
	 * output :5->5->5->1
	 * FOLLOW UP
	 * Suppose the digits are stored in forward order. Repeat the above problem.
	 */
	
	//non-recursion method
	public static Node addTwo(Node l1, Node l2){
		if(l1==null&& l2==null) return null;
		int add =0, carry=0;
		Node l_add = new Node(0);
		while(l1!=null && l2!=null){
			add = l1.data + l2.data + carry;
			carry = add/10;
		    l_add.appendToTail(add%10); 
		    l1=l1.next;
		    l2=l2.next;
		}
		
		while(l1!=null){
			add = l1.data +carry;
			carry = add/10;
			l_add.appendToTail(add%10);
			l1=l1.next;
		}
		
		while(l2!=null){
			add = l2.data+carry;
			carry = add/10;
			l_add.appendToTail(add%10);
			l2=l2.next;
		}
		//it turns out to be one more digit because of carry
		if (carry==1){
			l_add.appendToTail(carry);
		}
		return l_add.next;		
	}
	
	//concise method better!!!!
	public static Node addTwo2(Node l1, Node l2){
		if (l1==null && l2==null) return null;
		
		int add =0, carry=0;
		Node l_add = new Node(0);
		//first one;
//		if(l1!=null)
//		{add += l1.data ;
//		l1= l1.next;}
//		if(l2!=null)
//		{add += l2.data;
//		l2= l2.next;}
//		carry = add/10;
//		Node l_add = new Node(add%10);
		
		while(l1!=null || l2!=null||carry==1){
			add=0;
			if(l1!=null){
				add += l1.data;
				l1=l1.next;
			}
			if (l2!=null){
				add += l2.data;
				l2= l2.next;
			}
			add+=carry;
			carry = add/10;
		    l_add.appendToTail(add%10); 
		   
		}
		return l_add.next;		
		//return head.next; 
	}
	
	
	//Followup
//	public static Node addTwoFollowUp(Node l1, Node l2, int carry){
//		
//		
//		return l_add;
//	}
	
	
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		Node list1 = new Node(5);
		for (int i=0; i<5; i++){
			int random = (int)(Math.random()*10);
			list1.appendToTail(random);
		}	
//		Node list1 = null;
		Node.printNode(list1);
		
		Node list2 = new Node(8);
		for (int i=0; i<5; i++){
			int random = (int)(Math.random()*10);
			list2.appendToTail(random);
		}
		list2.appendToTail(9);
		Node.printNode(list2);
		
		Node l3 = addTwo2(list1,list2);
		Node.printNode(l3);
	}

}
