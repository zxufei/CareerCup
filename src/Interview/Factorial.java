package Interview;

public class Factorial {

	/**
	 * @param args
	 */
	public static long factorial (int n){
		if (n == 1) return 1;
		return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long test = factorial(10);
		System.out.println(test);
	}

}
