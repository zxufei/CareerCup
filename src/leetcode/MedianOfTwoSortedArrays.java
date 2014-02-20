package leetcode;

public class MedianOfTwoSortedArrays {

	/**
	 * @param args
	 * There are two sorted arrays A and B of size m and n respectively. 
	 * Find the median of the two sorted arrays. 
	 * The overall run time complexity should be O(log (m+n)).
	 */
	
	public static double findMedianSortedArrays(int[] A, int B[]) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        double median2 =0 ,median1 = 0;
        int middle = (A.length + B.length)/2;
        int i=0,j=0;
        while(middle >= 0){
        	median1 = median2;//record the previous number before median,if there are even numbers,
        	//we must get average number from them.
        	if (i<A.length && j<B.length){
        		if(A[i] <= B[j]){
        			median2 = A[i++];
        		}
        		else{
        			median2 = B[j++];
        		}
        	}
        	else if(i<A.length){
        		median2 = A[i++];
        	}
        	else if(j<B.length){
        		median2 = B[j++];
        	}
        	middle--;
        }
        if ((A.length + B.length)/2 == 0) return median2;//only one of the array has data.
        else if ((A.length + B.length)%2 != 0) return median2;
        else return (median1+median2)/2.0;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A ={4,6,9,10,11,20};
		int[] B ={2,8,9,11,40,90};
		System.out.print(findMedianSortedArrays(A,B));

	}

}
