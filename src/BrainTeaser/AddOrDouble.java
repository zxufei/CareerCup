package BrainTeaser;

public class AddOrDouble {

	/**
	 * @param args
	 * n从1开始，每个操作可以选择对n加一，或者对n加倍。如果n为2013，最少需要几个操作
	 */
	
	public static int numOperation(int n){
		int count = 0;
		while (n > 1){
			if (n%2 == 0){
				n /= 2;
				count++;
			}
			else{
				n -= 1;
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numOperation(125522));
//		StringBuffer sb = new StringBuffer("ddddd");
//		sb.delete(1, 2);
//		System.out.println(sb.toString());
	}

}
