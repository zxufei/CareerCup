package chapter5;

public class Question5_1 {

	/**
	 * @param args
		You are given two 32-bit numbers, N and M, and two bit positions, i and j  Write a 
		method to set all bits between i and j in N equal to M (e g , M becomes a substring of 
		N located at i and starting at j)   
		EXAMPLE:
		Input: N = 10000000000, M = 10101, i = 2, j = 6
		Output: N = 10001010100
	 */
	
	public static int setMN(int M, int N, int i, int j){

//		int mask1 = (1<<(j+i-1))-1;
//		int mask2 = (~0)<<i;
//		int mask = ~(mask1 & mask2);
		int mask1 = (~0)<<(j+1);//111100000000
		int mask2 = (1<<i) - 1;//00000000011
		int mask = mask1 | mask2;
		System.out.println(Integer.toBinaryString(mask));
		N = N & mask;
		N = N | (M << i);
		return N;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String M = "10101";
		String N = "1110001111100";
		
		System.out.print(Integer.toBinaryString(setMN(Integer.parseInt(M, 2),Integer.parseInt(N, 2),2,6)));
	}

}
