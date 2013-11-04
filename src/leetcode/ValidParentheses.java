package leetcode;

import java.util.Stack;

public class ValidParentheses {

	/**
	 * @param args
		Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
		determine if the input string is valid.
		The brackets must close in the correct order, 
		"()" and "()[]{}" are all valid but "(]" and "([)]" are not.
		http://discuss.leetcode.com/questions/201/valid-parentheses
	 */
	
	//using stack
	public static boolean isValid(String s) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
		Stack<Character> stack = new Stack<Character>();
		for (int i=0;i<s.length();i++){
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
				stack.push(s.charAt(i));
			}
			else{
				if (!stack.isEmpty()){
					switch(stack.pop()){
					case '(': if(s.charAt(i) != ')') return false;
							  break;
					case '[': if(s.charAt(i) != ']') return false;
							  break;
					case '{': if(s.charAt(i) != '}') return false;
							  break;
					}
				}
				else return false;//stack is empty but string is not end.
			}
		}
		//string is end but stack is not empty.
		if (stack.isEmpty()) return true;
		else return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()(";
		System.out.println(isValid(s));
	}

}
