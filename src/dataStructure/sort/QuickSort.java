package dataStructure.sort;

import java.util.Arrays;

public class QuickSort {

	/**
	 * @param args
	 * The worst case occurs if the chosen pivot happens to be the largest or smallest for each single partition.
	 */
	//in-place and array based
	public static void quickSort(int a, int b, int[] array){
		//pivot is a,and a would increment one, if a==b, a++ must larger than b and would not in the whileloop
		if (a<b){
			int part = partition2(a,b,array);
			quickSort(a,part-1,array);
			quickSort(part+1,b,array);
		}
	}
	
	public static int partition(int a,int b,int[]array){
//		int[] part = new int[2];
		int pivot = a++;
		while (a<=b){
			//a<b is needed in next following statements beacause the operation would change
			//the value of a and b.
			while (a<=b && array[a] <= array[pivot]) a++;
			while (a<=b && array[b] > array[pivot]) b--;//if neither if-statement has equals which would cause to infinity loop
			if (a<b) {
				int tmp = array[b];
				array[b] = array[a];
				array[a] = tmp;
				a++;
				b--;
			}
		}
		//after exchange b is before a, and we must exchange value with first pivot.
		int tmp = array[pivot];
		array[pivot] = array[b];
		array[b] =  tmp;
		
		//part index is the one before b and one after b.
//		part[0] = b-1;
//		part[1] = b+1;
		return b;
	}
	
	//in-place wikipedia algorithm for quick sort. array based
	public static int partition2(int a, int b, int[] array){
		int pivotIndex = a;
		int storeIndex = a+1;
		for (int i=a+1; i<=b; i++){
			if (array[i] < array[pivotIndex]){
				int tmp = array[i];
				array[i] = array[storeIndex];
				array[storeIndex] = tmp;
				storeIndex++;
			}
		}
		
		int tmp = array[pivotIndex];
		array[pivotIndex] = array[--storeIndex];//storeIndex ++ for next comparison.but swap is the former one.
		array[storeIndex] = tmp;
		
		return storeIndex;
	}
	
	//quicksort linkedlist based
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {0,4,5,6,2,4,3,2,3,4,2,3,6,3,0};
//		int[] A= {10,4,4,10,10};
		quickSort(0,A.length-1,A);
		System.out.println(Arrays.toString(A));
	}

}
