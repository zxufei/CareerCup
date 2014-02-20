package dataStructure.sort;

import java.util.Arrays;
import chapter2.*;

public class InsertSort {

	/**
	 * @param args
	 * Insertion sort using array and linked list.
	 */
	
	//array based insertion sort
	
	
	public static void insertSort(int[] list){
		for (int i=0; i<list.length; i++){
			//swap index and every comparation is between new location of list[i]
			//and former one.
			//not using for loop because end with no bigger than outer list[i]
			for(int j=i;j>0 && list[j] < list[j-1];j--){
				swap(j-1,j,list);
			}
		}
	}
	public static void swap(int pos1, int pos2, int[] list){
		int tmp = list[pos1];
		list[pos1] = list[pos2];
		list[pos2] = tmp;
	}
	
	public static void insertSort2(int[] list){
		for (int i=0; i<list.length; i++){
			int tmp = list[i];
			int j = i;//record out loop value list[i]. just shift bigger to next index
			//Then when there is no bigger than list[i], put value in this location.
			for(j=i;j>0 && tmp < list[j-1];j--){
				list[j] = list[j-1];
			}
			list[j] = tmp;
		}
	}
	

	//insertion sort using linked list
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
		int [] list = new int[10];
		for (int i=0; i<10; i++){
			list[i] = (int) (Math.random()*10);
		}
		insertSort2(list);
		System.out.print(Arrays.toString(list));
	}

}
