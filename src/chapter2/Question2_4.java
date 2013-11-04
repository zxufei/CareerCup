package chapter2;

public class Question2_4 {

	/**
	 * @param args
	 * Write code partition a linked list around a value x, such that
	 * all nodes less than x come before all nodes greater or equal to x.
	 */
	
	//Do not get a single node from original linked list
	//will cause infinity loop
	public static Node partition(Node head, int x){
		//create two linkedlist
		Node smaller = null;
		Node smallerend = null;
		Node larger = null;
		Node largerend = null;
		
		Node iterator = head;
		while(iterator!=null){
			if(iterator.data <= x){
				if(smaller == null){//if it was the first node
				smaller = iterator;
				smallerend = smaller;
				}
				else{
					smallerend.next = iterator;
					smallerend = iterator;
				}
			}
			else{
				if(larger == null){
					larger = iterator;
					largerend = larger;
				}
				else{
					largerend.next = iterator;
					largerend = iterator;
				}
			}
			iterator = iterator.next;
		}
		
		//important! otherwise would cause infinity loop
		largerend.next =null;
		if (smaller==null){
			return larger;
		}
		
		smallerend.next = larger;
		return smaller;	
	}
	
	
	//get a single node from original linked list
	public static Node partition2(Node head, int x){
		Node smaller=null, smallerend=null, larger=null, largerend = null;
		
		while (head !=null){
			Node node = head.next;//copy next of head to node
			head.next=null;
			if (head.data < x){
				if(smaller == null){//if it was the first node
					smaller = head;
					smallerend = smaller;
					}
					else{
						smallerend.next = head;
						smallerend = head;
					}
				}
				else{
					if(larger == null){
						larger = head;
						largerend = larger;
					}
					else{
						largerend.next = head;
						largerend = head;
					}
				}
			head = node;
			}	
		if (smaller==null){
			return larger;
		}
		
		smallerend.next = larger;
		return smaller;	
					
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node list = new Node(1);
		for (int i=0; i<10; i++){
			int random = (int)(Math.random()*100);
			list.appendToTail(random);
		}
		Node.printNode(list);
		Node newlist = partition(list,50);
		Node.printNode(newlist);
		
		
	}

}
