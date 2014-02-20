package leetcode;

public class Power {

	/**
	 * @param args
	 * Implement pow(x, n).
	 */
	
	public static double pow(double x, int n) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        double result = 1;
        if (n>=1){
            for (int i=0; i<n; i++){
                result *=x;
            }
            return result;
        }
        else if (n == 0) return 1;
        else if (n < 0){
            for (int i=0; i<-n; i++){
                result *=x;
            }
            return 1.0/result;
        }
      return result;  
    }
	
	public static double pow2(double x, int n){
		if (n >= 0){
			return power(x,n);
		}
		else {
			return 1.0/power(x,-n);
		}
	}
	
	public static double power(double x, int n){
		if (n == 0) return 1;
		double result = power(x,n/2);
		if (n%2 == 0) return result*result;
		else  return result*result*x;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(pow2(2,200));
		
	}

}
