package leetcode;

public class SortList {

	/**
	 * @param args
	 */

	 class ListNode {
	    int val;
	     ListNode next;
	     ListNode(int x) {
	         val = x;
	         next = null;
	     }
	 }
	
	public ListNode sortList(ListNode head) {
	       return mergeSort(head);
	    }
	    
	    public ListNode mergeSort(ListNode list){
	        if (list != null && list.next != null){
	            ListNode firstList = list;
	            ListNode secondList = split(list);
	            ListNode firstSorted = mergeSort(firstList);
	            ListNode secondSorted = mergeSort(secondList);
	            ListNode sortList = combine(firstSorted, secondSorted);
	            return sortList;
	        }
	        return list;
	    }
	    
	    
	    public ListNode split(ListNode list){
	        if (list == null || list.next ==  null) return null;
	        ListNode pt = list;
	        int count = 1;
	        while(pt.next!=null){
	            pt = pt.next;
	            count++;
	        }
	        ListNode middle = list;
	        for (int i=1; i<count/2; i++){
	            middle = middle.next;
	        }
	        ListNode second = middle.next;
	        middle.next = null;
	        return second;
	    }
	    
	    public ListNode combine(ListNode l1, ListNode l2){
	        ListNode newNode = null;
	        ListNode pt = null;
	        while(l1!= null && l2 != null){
	            if (l1.val <= l2.val){
	                ListNode tmp = l1;
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
	                ListNode tmp = l2;
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
	            ListNode tmp = l1;
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
	            ListNode tmp = l2;
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
