package leetcode;
import chapter2.*;
public class InsertionSortList {

	/**
	 * @param args
	 * Sort a linked list using insertion sort.
	 * algorithm from wikipedia
	 */
    public Node insertionSortList(Node head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (head == null || head.next == null) return head;
        Node sortedList = null;
        
        while (head != null) {
            Node current = head;
            head = head.next;
            if (sortedList == null || sortedList.data > current.data){
                //insert into head of sorted list
                current.next = sortedList;
                sortedList = current;
            }
            else{
                Node tmp = sortedList;
                while (tmp != null){
                    if (tmp.next == null || tmp.next.data > current.data){
                        current.next = tmp.next;
                        tmp.next = current;
                        break;
                    }
                    tmp = tmp.next;
                }
            }
        }
        
        return sortedList;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
