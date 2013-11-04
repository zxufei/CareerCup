package Interview;

public class PowerTwo {

	/**What is the fastest way to test if an integer is a power of two? 
	 * reference:http://www.exploringbinary.com/ten-ways-to-check-if-an-integer-is-a-power-of-two-in-c/
	 * @param args
	 */
	
	//Count one in bit of number,only one bit if is power of two.
	static boolean checkPowTwo(int x){
		int countOne = 0;
		while ((x!=0) && (countOne <= 1)){
			if( (x & 1)== 1) countOne++;
			x = x>>1;
		}
		return (countOne ==1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 510;
		boolean test = checkPowTwo(x);
		System.out.print(test);
	}

}
