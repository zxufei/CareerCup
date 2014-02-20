package leetcode;

public class BestTimeBuySellStock {

	/**
	 * @param args
	Say you have an array for which the ith element is the price of a given stock on day i.
	If you were only permitted to complete at most one transaction
	(ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
	 */
	public int maxProfit(int[] prices) {
	        // IMPORTANT: Please reset any member data you declared, as
	        // the same Solution instance will be reused for each test case.
		if (prices.length == 0) return 0;
	    int minBuy = 0;
	    int maxProfit = 0;
	    for (int i=0; i<prices.length ;i++){
	    	if (prices[i] < prices[minBuy]){
	    		minBuy = i;
	    	}
	    	if ((prices[i]-prices[minBuy]) > maxProfit){
	    		maxProfit = prices[i] -  prices[minBuy];
	    	}
	    }
	    return maxProfit;   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
