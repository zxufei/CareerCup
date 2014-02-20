package leetcode;

public class MergeSortedArray {

	/**
	 * @param args
	 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
Note:
You may assume that A has enough space to hold additional elements from B. 
The number of elements initialized in A and B are m and n respectively.
	 */
	
	//from the tail of every array and insert into the tail of new array.
    public void merge(int A[], int m, int B[], int n) {
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
	
	//extra buffer
	public void merge2(int A[], int m, int B[], int n) {
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
	
	//in-place
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
