package dataStructure.sort;
import java.util.*;

public class MergeSort {

	/**
	 * @param args
	 */
	
	//using Arraylist.
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
//		test.add(4);
//		test.add(6);
//		test.add(0);
//		test.add(1);
//		test.add(3);
//		test.add(9);		
//		test.add(4);
//		test.add(3);
//		test.add(9);
		for (int i=0; i<20; i++){
			int random = (int)(Math.random()*100);
			test.add(random);
		}
		System.out.println(test);
		mergeSort(test);
		System.out.println(test);
		
	}

}
