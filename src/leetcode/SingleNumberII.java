package leetcode;

public class SingleNumberII {

	/**
	 * @param args
		Given an array of integers, every element appears three times except for one. Find that single one.
		Note:
		Your algorithm should have a linear runtime complexity. 
		Could you implement it without using extra memory?
		http://discuss.leetcode.com/questions/2811/single-number-and-single-number-ii
		http://blog.csdn.net/doc_sgl/article/details/12259807
		http://gongxuns.blogspot.com/2013/10/leetcode-single-number-ii.html
	 */
    public static int singleNumber(int[] A) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        //like the idea of xor in twice expect for one. sum every last bits accordingly 
        //through all numbers(other bit is the same). Because all numbers appear three times except for one. so the bits 
        //of this single one would be the exactly 0 or 1 if sum of bits %3.
        
        int sumBits = 0;
        int result = 0; 
        //assume 32bits
        //O(n)
        for (int i=0; i< 32; i++){
            //begin at last bit;
            sumBits = 0;
            for (int j=0; j<A.length; j++){
                sumBits = sumBits + ((A[j]>>i) & 1);
            }
            result = result + ((sumBits%3)<<i);
        }
        return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,2,3,2,3,4,4,3,4,100};
		System.out.println(singleNumber(A));
	}

}
