package leetcode;

import chapter2.Node;

public class PartitionList {

	/**
	 * @param args
	 * Given a linked list and a value x, 
	 * partition it such that all nodes less than x come before nodes greater than or equal to x.
You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.
	 */
	public static Node partition(Node head, int x) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        Node sHead=null,sTail=null;
        Node lHead=null,lTail=null;
        while (head!=null){
            Node tmp = head;
            head = head.next;
            tmp.next = null;
            if (tmp.data < x){//small come before less or equal
                if (sHead == null){
                    sHead = tmp;
                    sTail = tmp;
                }
                else{
                    sTail.next = tmp;
                    sTail = sTail.next;
                }
            }
            else{
                if (lHead == null){
                    lHead = tmp;
                    lTail = tmp;
                }
                else{
                    lTail.next = tmp;
                    lTail = lTail.next;
                }
            }
        }
        if (sHead != null){
            sTail.next = lHead;
            return sHead;
        } 
        else return lHead;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node list = new Node(1);
		for (int i=0; i<5; i++){
			list.appendToTail((int)(Math.random()*10));
		}
		Node.printNode(list);
		Node.printNode(partition(list,2));
	}

}
