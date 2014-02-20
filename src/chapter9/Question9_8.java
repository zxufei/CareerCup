package chapter9;

public class Question9_8 {

	/**
	 * 9.8
	 * Given an infinite numbers of quarters (25 cents), dime (10 cents), nickels (5 cents)
	 * and pennies (1 cent), write code to calculate the number of ways of representing n cents.
	 * 
	 */
	
	
	public static int makeMoney(int n, int money){
		int nextMoney = 0;
		switch (money){
		case 25: nextMoney = 10;break;
		case 10: nextMoney = 5;break;
		case 5:  nextMoney = 1;break;
		case 1:  return 1;
		}
		
		int ways = 0;
		for (int i=0; i*money < n; i++){
			ways += makeMoney(n- i*money,nextMoney);
		}
		return ways;
	}
	
	static int[] money = {25, 10, 5, 1};
	public static int makeMoney2(int n, int index){
		if (index == 3 || n == 0) return 1;
		int ways = 0;
		for (int i=0 ; i*money[index] <n; i++){
			ways += makeMoney2(n-i*money[index],index+1);
		}
		return ways;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makeMoney(100,25));
		System.out.print(makeMoney2(100,0));
	}

}
