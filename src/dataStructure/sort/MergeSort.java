package dataStructure.sort;
import java.util.*;

import chapter2.*;

public class MergeSort {

	/**
	 * @param args
	 */
	

	//leetcode sortList using linkedlist for merge sort. linkedlist based
    public Node mergeSort(Node list){
        if (list != null && list.next != null){
            Node firstList = list;
            Node secondList = split(list);
            Node firstSorted = mergeSort(firstList);
            Node secondSorted = mergeSort(secondList);
            Node sortList = combine(firstSorted, secondSorted);
            return sortList;
        }
        return list;
    }
    
    
    public Node split(Node list){
        if (list == null || list.next ==  null) return null;
        Node pt = list;
        int count = 1;
        while(pt.next!=null){
            pt = pt.next;
            count++;
        }
        Node middle = list;
        for (int i=1; i<count/2; i++){
            middle = middle.next;
        }
        Node second = middle.next;
        middle.next = null;
        return second;
    }
    
    public Node combine(Node l1, Node l2){
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
    
    
    //array based mergesort
    
	//using Arraylist based.
	public static void mergeSort ( ArrayList<Integer> left ){
		ArrayList<Integer> right = new ArrayList<Integer>();
		if (left.size() == 1) return;
		divide(left,right);
		mergeSort(left);
		mergeSort(right);
		combine(left,right);
	}
	
	public static void divide ( ArrayList<Integer> left, ArrayList<Integer> right){
		
		int half_index = (left.size()-1)/2;
//		for (int i = half_index+1; i<left.size(); i++){
//			right.add(left.get(i));
//		}
//		for (int j = half_index+1; j<left.size(); j++){
//			right.remove(j);
//		}			
		for (int i = half_index+1; i<left.size(); i++){
			right.add(left.get(half_index+1));
			left.remove(half_index+1); 
		}	
	}
	
	public static void combine( ArrayList<Integer> left, ArrayList<Integer> right){
		ArrayList<Integer> temp = new ArrayList<Integer>();
		while(left.size()!=0 && right.size()!=0){
			if(left.get(0)<right.get(0)){
				temp.add(left.get(0));
				left.remove(0);
			}
			else{
				temp.add(right.get(0));
				right.remove(0);
			}
		}
		while(left.size() != 0){
			temp.add(left.get(0));
			left.remove(0);
		}
		while(right.size() != 0){
			temp.add(right.get(0));
			right.remove(0);
		}
		
		left.clear();
		left.addAll(temp);
//		while(temp.size()!=0){
//			left.add(temp.get(0));
//			temp.remove(0);
//		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> test = new ArrayList<Integer>();
		for (int i=0; i<20; i++){
			int random = (int)(Math.random()*100);
			test.add(random);
		}
		System.out.println(test);
		mergeSort(test);
		System.out.println(test);
		
	}

}
