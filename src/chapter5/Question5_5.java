package chapter5;

public class Question5_5 {
	
	/**
	 * 5.5 Write a function to determine the number of bits required to convert integer A to integer B.
	 * EXAMPLE: 
	 * Input: 31, 14
	 * Output: 2
	 */
	
	public static int bitConvert(int a, int b){
		return countOne(a^b);
	}
	
	public static int countOne(int a){
		int count = 0;
		for(; a>0; a=a>>1){
			count += a&1;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "11111";
		String b = "1110";
		
//		System.out.println(countOne(Integer.parseInt(b,2)));
		System.out.print(bitConvert(Integer.parseInt(a,2),Integer.parseInt(b,2)));
//		System.out.println(bitConvert(31,14));

	}

}
