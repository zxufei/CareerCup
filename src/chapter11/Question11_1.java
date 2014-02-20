package chapter11;

import java.util.Arrays;

public class Question11_1 {

	/**
	 * @param args
	 * You are given two sorted arrays. A and B, where A has a large enough buffer
	 * at the end to hold B. Write a method to merge B into A in sorted order.
	 */
	
    public static void  merge(int A[], int m, int B[], int n) {
        int i = m+n-1;//new index
        int a = m-1;
        int b = n-1;
        while(a >= 0 && b >= 0){
            if (A[a] > B[b]){
                A[i--] = A[a--];
            }
            else{
                A[i--] = B[b--];
            }
        }
        
        while(a >= 0){
            A[i--] = A[a--];
        }
        
        while(b >= 0){
            A[i--] = B[b--];
        }      
    }
	public static void merge2(int A[], int m, int B[], int n) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int[] tmp = new int[A.length];
        int indexA=0,indexB=0;
        int i = 0;
        while ( indexA<m && indexB <n){
            if (A[indexA] < B[indexB]){
                tmp[i++] = A[indexA++];
            }
            else{
                tmp[i++] = B[indexB++];
            }
        }
        while(indexA<m){
            tmp[i++] = A[indexA++];
        }
        while(indexB<n){
            tmp[i++] = B[indexB++];
        }
        
//        for (int j=0; j<A.length; j++){
//            A[j] = tmp[j];
//        }
        System.arraycopy(tmp, 0, A, 0, tmp.length);
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {0,3,3,0,0,0,0,0,0};
		int[] B = {0,1,1};
		merge(A,3,B,3);
		System.out.println(Arrays.toString(A));
	}

}
