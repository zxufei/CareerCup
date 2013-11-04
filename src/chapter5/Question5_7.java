package chapter5;

import java.util.ArrayList;

public class Question5_7 {

	/**
	 * 5.7 An array  contains all the integers from 0 to n, except for one number which is 
	 * missing. In this problem, we cannot access an entire integer in A with a single 
	 * operation. The elements of A are represented in binary, and the only operation 
	 * we can use to access them is "fetch the jth bits of A[i]", which takes constant time.
	 * Write code to find the missing integer. Can you do it in O(N) time?
	 */
	
	/**
		* Given a sorted element of size n that should contain unique integers between 0 and n (0 & n inclusive). 
		 * Identify the missing element.
		 * eg) n = 5
		 *  array = 0, 1, 2, 4, 5
		 *  array = 0, 1, 2, 3, 4
		 *  
		 * How many possible situation is there?
		 * Answer: if no missing element, the array is 0, 1, 2, 3, 4, ..., n
		 *         now there is missing one which could be anyone
		 *         so there are n possible ways	
	 */
	 class BitInteger{
		static final int INTEGER_SIZE = 4;
		int[] A = new int[INTEGER_SIZE];
		BitInteger(){
			for(int a:A){
				a=1;
			}
		}
		public int fetch(int column){
			return A[column];
		}
	}
	
	//cc150
		public static int findMissingBinary(ArrayList<BitInteger> array){
			return findMissingBinary(array,BitInteger.INTEGER_SIZE-1);		
		}
		
		public static int findMissingBinary(ArrayList<BitInteger> array,int column){
			if(column<0) return 0;
			ArrayList<BitInteger> oneBits = new ArrayList<BitInteger>();
			ArrayList<BitInteger> zeroBits = new ArrayList<BitInteger>();
			for (BitInteger i:array){
				if (i.fetch(column)==1){
					oneBits.add(i);
				}
				else{
					zeroBits.add(i);
				}
			}
			//count(0)>=count(1)
			if (zeroBits.size() <= oneBits.size()){
				int v = findMissingBinary(zeroBits,column-1);
				return (v<<1) | 0;
			}else{
				int v = findMissingBinary(oneBits,column-1);
				return (v<<1) | 1;
			}
		}
	
	
	
	
	//orignial sum - sum = missing one
	//amazon interview
	public static int findMissing(int[]A){
		int sum = 0;
		for (int i:A){
			sum +=i;
		}
		int sum_total = A.length*(A.length+1)/2;
		return sum_total-sum;
	}
	
	//because it is sorted array, we can compare i and i+1
	public static int findMissing2(int[]A){
		if (A[0]==0 && A[A.length-1]==A.length-1){
			return A.length;
		}
		else if(A[0]==1 && A[A.length-1]==A.length){
			return 1;
		}
		else{
			for(int i=0; i<A.length;i++){
				int diff = A[i+1]-A[i];
				if (diff>1){
					return A[i]+1;
				}
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={0,1,2,4,5};
		int[] B={0,1,2,3,4};
		System.out.println(findMissing2(A));
	}

}
