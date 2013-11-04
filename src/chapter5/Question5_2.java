package chapter5;

public class Question5_2 {

	/**
	 * @param args
	 * 
	 * 5.2 Given a real number between 0 and 1 (e.g., 0.72) that is passed in as a double.
	 *  Print the binary representation. If the number cannot be represented accurately
	 *  in binary with at most 32 characters, print "ERROR". 
	 */
	
	public static String printBinary(double d){
//		//integer part
//		while ((int)d > 0){
//			if (d%2 == 0) System.out.print(0);
//			else System.out.print(1);
//			d = d/2;
//		}
		
		
		//decimal part
		StringBuffer sb = new StringBuffer();
		sb.append(".");
		
		while(d>0){
			if (sb.length() > 32) return "ERROR";
			sb.append((int)(d*2));
			if ((int)(d*2)>=1) d = d*2-1;
			else d = d*2;
		}
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double test = 0.625;
		System.out.print(printBinary(test));
	}

}
