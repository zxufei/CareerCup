package leetcode;

import java.util.Stack;

public class LongestValidParentheses {

	/**
	 * @param args
	Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) 
	parentheses substring.
	For "(()", the longest valid parentheses substring is "()", which has length = 2.
	Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
	 */
	
	 public static int longestValidParentheses(String s) {
	        // IMPORTANT: Please reset any member data you declared, as
	        // the same Solution instance will be reused for each test case.
	        Stack<Integer> stack = new Stack<Integer>();
	        int maxLen = 0, last = -1;
	        for (int i=0; i<s.length(); i++){
	        	if (s.charAt(i) == '('){
	        		stack.push(i);
	        	}
	        	else{
	        		if (!stack.isEmpty()){
	        			stack.pop();
	        			if (stack.isEmpty()) maxLen = Math.max(maxLen, i-last);
	        			else maxLen = Math.max(maxLen, i-stack.peek());
	        		}
	        		else{
	        			last = i;
	        		}
	        		
	        	}
	        }
	        return maxLen;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
