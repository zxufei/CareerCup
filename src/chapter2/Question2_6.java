package chapter2;

public class Question2_6 {

	/**
	 * @param args
	 * Given a circular linked list, implement an algorithm which returns the nodes at 
	 * the beginning of the loop.
	 * DEFINITION
	 * Circular linked list: A(corrupt) linked list in which a node's next points
	 * to an earlier node, so as to make a loop in the linked list
	 * EXAMPLE
	 * Input:A->B->C->D->E->C[the same C as earlier]
	 * Output:C
	 */
	
	
	public static Node findCircularHead (Node list){
		Node slow = list, fast = list;
        if (list == null) return null;
        //first overlap
        while (fast.next != null){
            slow = slow.next;
            if (fast.next.next == null){
                return null;
            }
            else fast = fast.next.next;
            if (slow == fast) break;
        }
        //not cycle list
        if (fast.next == null) return null;
        //the begin looper at head
        if (fast == list) return list;
        //the begin not at head
        slow = list;
        while(true){
            slow = slow.next;
            fast = fast.next;
            if (slow == fast) return slow;
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node list = new Node(5);
		Node tail = list;
		Node point = list;
		for (int i =0; i< 6; i++){
			int random = (int)(Math.random()*100);
			list.appendToTail(i);
			tail = tail.next;
		}
		
		for (int i=0; i<3; i++){
			point = point.next; 
		}
		
		tail.next = point;
		//print
		Node copy = list;
		for (int i=0; i<20; i++){
			System.out.print(copy.data+"->");
			copy = copy.next;
		}
		System.out.println(copy.data);
		
		//find start of circle
		Node s = findCircularHead(list);
		System.out.println(s.data);
		
		
		
	}

}
