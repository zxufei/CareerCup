package BrainTeaser;

public class PeachLeft {

	/**
	 * @param args
	在很久很久以前，有五只淘气的猴子，每天无忧无虑的玩耍。有一天，他们五个发现了一堆可怜的桃子，他们打算把桃子们平均分掉，可天色已晚，他们约定：
	等第二天再把桃子分掉，然后就各自去休息了。半夜，第一只猴子醒了，心想“提前把桃子分了，这样可以提前吃”，于是来到那一堆桃子面前，
	把桃子平均分成了５堆，分完后发现余出来一个，他就把富余的那个吃了，然后拿走属于自己的那一堆走了。过了会，第二只猴子也醒了，
	心里想的跟第一只猴子一样，于是他也来到那一堆桃子面前，这时，他发现那里分成了四堆桃子，因为不知道已经有一个猴子来过了，
	又因为他知道一共有五个猴子，所以他就把桃子们推到了一起合并为一堆，接着平均分成了五堆，分完后发现余出来一个，
	他就把富余的那个吃了，然后拿走属于自己的那一堆走了。
	又过了会，第三只猴子、第四只、第五只都一个一个的重复了上面的过程，推到一起，分桃，吃了富余的一个，带走其中属于自己的那一堆。
	好了，我的问题来了，就像这道题的题目一样，请问：最初至少有多少个桃子呢？
	
	设原来一堆是x1，下一堆剩下的就是x2=（x1-1）/5*4
	 */
	
	//recursion
	public static int monkeyPeachLeft(int totalMonkey, int wakedMonkey, int peachLeft){
		if (wakedMonkey == 0) return peachLeft;
		if (peachLeft%(totalMonkey-1) == 0){
			int previousLeftPeach = peachLeft/(totalMonkey-1)*totalMonkey+1;
			return monkeyPeachLeft(totalMonkey,wakedMonkey-1,previousLeftPeach);
		}
		else return 0;
	}
	//non-recursion
	public static int monkeyPeachLeft(int totalMonkey){
		int peachLeftAtLast = 1;
		int previousLeftPeach = 1;
		int wakedMonkey = totalMonkey;
		
		while(wakedMonkey > 0){
			if (previousLeftPeach%(totalMonkey-1)==0){
				previousLeftPeach = previousLeftPeach/(totalMonkey-1)*totalMonkey +1;
				wakedMonkey--;
			}
			else{
				peachLeftAtLast ++;
				previousLeftPeach = peachLeftAtLast;
				wakedMonkey = totalMonkey;	
			}
		}
		return previousLeftPeach;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int peachAtLast = 1;
		while(monkeyPeachLeft(5,5,peachAtLast)==0)peachAtLast++;
		
		System.out.println(monkeyPeachLeft(5,5,peachAtLast));
		System.out.print(monkeyPeachLeft(5));
	}

}
