package Euler;


//noom interview
public class PennyDollarCombination {

	/**
	 * @param args
	 * Euler 31
	 * In the land of Zyzzlvaria, the currency is made up of the dollar ($) and pence (p). 
	 * There are eight coins in general circulation: 
	 * 1p, 2p, 5p, 10p, 20p, 50p, $1 (100p) and $2 (200p). 
	 * It is possible to make $2 in the following way: 
	 * 1x$1 + 1x50p + 2x20p + 1x5p + 1x2p + 3x1p 
	 * How many different ways can $2 be made using any number of coins?
	 */
	public static int count =0;
	public static int[] money = {200, 100, 50, 20, 10, 5, 2, 1};
	public static void pennyDollar(int index, int total){
		if (total==0 || index == money.length - 1){
			count ++;
			return;
		}
		for (int i=0; i<= total/money[index]; i++){
			pennyDollar(index+1, total-i*money[index]);
		}
		
	}
	
	public static int pennyDollar2(){
		int ways=1;
		for(int i=0; i<=200/money[1]; i++){
			for(int j=0; j<=200/money[2]; j++){
				for(int k=0; k<=200/money[3]; k++){
					for(int l=0; l<=200/money[4]; l++){
						for(int m=0; m<=200/money[5]; m++){
							for(int n =0; n<=200/money[6];n++){
								for(int o=0;o<=200/money[7];o++){
									if(i*money[1]+j*money[2]+k*money[3]+
											l*money[4]+m*money[5]+n*money[6]+o*money[7] == 200)
										ways++;
								}
							}
						}
					}
				}
			}
		}
		return ways;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total =200;
		System.out.println(pennyDollar2());
		pennyDollar(0,total);
		System.out.println(count);
	}

}
