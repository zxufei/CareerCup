package chapter9;

import java.util.ArrayList;
import java.util.Collections;

public class Question9_4 {

	/**
	 * @param args
	 * Write a method to return all subsets of a set
	 */
	public static ArrayList<ArrayList<Integer>> subSet(int[] A){
		int numSets = 1 <<A.length ;//2^A.length
//		int numSets = (int) Math.pow(2.0, A.length);
		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> sub = new ArrayList<Integer>();
		for (int i=0; i<numSets; i++){
			int mask = i;
			sub.clear();
			for (int j=0; j<A.length; j++){
				if ((mask & 1) == 1) {
					sub.add(A[A.length-1 - j]);
				}
				mask = mask >> 1;
			}
			results.add(new ArrayList<Integer>(sub));
		}
		return results;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3};
		System.out.print(subSet(A));
	}

}
