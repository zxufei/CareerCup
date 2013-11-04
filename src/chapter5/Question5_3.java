package chapter5;

public class Question5_3 {

	/**
	 * 5.3 Given a positive integer, print the next smallest and the next largest number that
	 * have the same number of 1 bits in their binary representation.
	 */
	
	public static int[] sameOneNear(int p){
		//count on
		int count = countOne(p);
		int[] result = new int[2];
		//near largest
		int temp = p;
		while(true){
			temp +=1;
			if (countOne(temp) == count) break;
		}
		result[0] = temp;
		//near smallest
		temp = p;
		while(true){
			temp -=1;
			if (countOne(temp) == count) break;
		}
		result[1] = temp;
		return result;	
	}
	
	public static int countOne(int a){
		int count = 0;
		while(a > 0){
			if (a%2 == 1) count++;
			a /=2;
		}
		return count;
	}
	
	
	//method2
//	public static String[] sameOneNear2(int p){
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = 8;
		System.out.println(Integer.toBinaryString(test));
		int[] result = sameOneNear(test);
		System.out.println(Integer.toBinaryString(result[0])+" "+Integer.toBinaryString(result[1]));
	}

}
