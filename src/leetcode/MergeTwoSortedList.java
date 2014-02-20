package leetcode;
import chapter2.Node;

public class MergeTwoSortedList {

	/**
	 * @param args
	 */
	public Node mergeTwoLists(Node l1, Node l2) {
        Node newNode = null;
        Node pt = null;
        while(l1!= null && l2 != null){
            if (l1.data <= l2.data){
                Node tmp = l1;
                l1 = l1.next;
                tmp.next = null;
                if (newNode == null) {
                    newNode = tmp;
                    pt = tmp;
                }
                else{
                    pt.next = tmp;
                    pt = pt.next;
                }
            }
            else{
                Node tmp = l2;
                l2 = l2.next;
                tmp.next = null;
                if (newNode == null) {
                    newNode = tmp;
                    pt = tmp;
                }
                else{
                    pt.next = tmp;
                    pt = pt.next;
                }
            }
        }
        while(l1!=null){
            Node tmp = l1;
            l1 = l1.next;
            tmp.next = null;
            if (newNode == null) {
                newNode = tmp;
                pt = tmp;
            }
            else{
                pt.next = tmp;
                pt = pt.next;
            }
        }
        while(l2!=null){
            Node tmp = l2;
            l2 = l2.next;
            tmp.next = null;
            if (newNode == null) {
                newNode = tmp;
                pt = tmp;
            }
            else{
                pt.next = tmp;
                pt = pt.next;
            }
        }
        
        return newNode;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
