package Interview;

import java.util.*;

public class DeleteOdd {

	/**
	 * @param args
	 * 10000 人排队,奇数号踢掉,剩下的重新排号码,继续踢,剩下最后一个有奖。问你要站哪里
	 */
	
	public static void deleteOdd(LinkedList<Integer> list){
		for (int i=0; i<list.size(); i++){
			if (i%2==0) list.set(i, 0);
		}	
		//method 1 to remove all specific elements.
//		for (int i=0; i<list.size(); i++){
//			if(list.get(i).equals(0)) list.remove(i--);
//		}
		
		//method2
//		list.removeAll(Arrays.asList(0));
		
		//method3
//		while(list.remove((Integer) 0)){};
		while(list.remove(Integer.valueOf(0))){};
	}
	
	
	public static void main(String[] args) {
		//create list
		LinkedList<Integer> li = new LinkedList<Integer>();
		for (int i=1; i<=10000; i++){
			li.add(i);
		}
		
		while (li.size()>1){
			deleteOdd(li);
		}
		
		System.out.println(li);
		
		//List<Integer> li2 = new LinkedList<Integer>();
		//List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
	}

}
