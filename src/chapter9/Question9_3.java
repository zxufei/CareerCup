package chapter9;

public class Question9_3 {

	/**
	 * @param args
	 * A magic index in an array A[0...n-1] is defined to be an index such that 
	 * A[i] = i. Given a sorted array, write a method to find a magic index,
	 * if one exists, in array A.
	 * FOLLOW UP
	 * What if the values are not distinct?
	 */
	
	public static int findMagicIndex(int[] A){
		for (int i=0; i<A.length; i++){
			if (A[i] > i) return -1;
			else if (A[i] == i) return i;
		}
		return -1;
	}
	
	//brute force
	public static int findMagicIndex2(int[] A){
		for (int i=0; i< A.length; i++){
			if (A[i] ==  i) return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
