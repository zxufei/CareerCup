package Interview;

public class parity {

	/**What's wrong with the following code?
	 * parityStr is a type of string that is immute. String is constant, its value can't be changed after it is created.
	 * It result many garbage
	 * @param args
	 */
	   public static String parity1(String msg)
	   {
	       String parityStr = null;
	       int n = msg.hashCode();
	       System.out.println(n);
	       switch( n % 2 )
	       {
	       case 0:
	           parityStr = "even";
	           break;
	       case 1:
	           parityStr = "odd";
	           break;
	       }
	       return parityStr;
	   }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "ssssddf88";
		String output = parity1(test);
		System.out.println(output);
	}

}
