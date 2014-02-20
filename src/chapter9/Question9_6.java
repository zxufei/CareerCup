package chapter9;

import java.util.*;

public class Question9_6 {

	/**
	 * @param args
	 * /**
	 * 9.6
	 * Implement an algorithm to print all valid (e.g., properly opened and closed)
	 * combination of n-pairs of parenthese.
	 * Example
	 * Input 3
	 * Output ((())),(()()),(())(),()(()),()()()
	 * 
	 */
	
	public static HashSet<String> allValidParentheses(int n){
		if (n == 1 )  return new HashSet<String>(Arrays.asList("()"));
		
		HashSet<String> results = new HashSet<String>();
		for(String s:allValidParentheses(n-1)){
			for (int i=0; i<s.length(); i++){
				StringBuffer sb = new StringBuffer();
				if (s.charAt(i) == '('){
					sb.append(s);
					sb.insert(i+1, "()");
					results.add(new String(sb));
				}	
			}
			if (!results.contains("()"+s)){
				results.add("()"+s);
			}
			if (!results.contains(s+"()")){
				results.add(s+"()");
			}
		}
		return results;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(allValidParentheses(3));
	}

}
