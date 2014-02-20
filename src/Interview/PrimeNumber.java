package Interview;
import java.util.*;
public class PrimeNumber {

	/**
	 * @param args
	 *Given an integer, print out all the prime numbers smaller than that integer.
	 */
	
	public static void print_pr_n(int n){
		HashSet<Integer> composites = new HashSet<Integer>(n);
		if(n >= 1) System.out.print("1, ");
		for(int i = 2; i <= n; i++){
			if(!composites.contains(i)){
				System.out.print(i + ", ");
				if(i <= Math.sqrt(n)+1){
					for(int j = 2; i*j <= n; j++){
						composites.add(i*j);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_pr_n(20);
	}

}
