package chapter5;

public class Question5_6 {

	/**
	 * 5.6 Write a program to swap odd and even bits in an integer with as few instructions as possible.
	 * (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, and so on).
	 */
	
	//String.parseInt("45E213", 16)//16 radix binary, 10 radix, 16 radix
	public static int shiftEvenOdd(int a){
		int mask = 0xAAAAAAAA;//1010 1010 1010 1010
		int mask2 = 0x55555555;//0101 0101 0101 0101
		return ((a & mask)>>1) | ((a & mask2)<<1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "10010101";
		System.out.print(Integer.toBinaryString(shiftEvenOdd(Integer.parseInt(test,2))));
	}

}
