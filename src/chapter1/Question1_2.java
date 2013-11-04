package chapter1;

import java.util.*;
/** Question1.2
 * 4th
 * write code to reverse a C-Style String. 
 * (C-String means that "abcd" is represented 
 * as five characters, including the null character.)
 *
 * 5th
 * Implement a function void reverse(char * str) in C or C++
 * which reverse a null-terminated string
 */

public class Question1_2 {	
//	String cannot be modified once created, the assignment just changes the refer to a new object
//	Function parameter passing always pass the copy of reference
//	reference to address and basic types are stored in stack, and real objects are stored in heap.
	
	
	public static String reverseC1 (String str){
		Stack<Character> charStack = new Stack<Character>();
//		for (int i =0; i<str.length(); i++){
//			charStack.push(str.charAt(i));
//		}
		for (char c : str.toCharArray()){
			charStack.push(c);
		}
		
		StringBuffer s = new StringBuffer();//also can use String but once concatenation, a new string is created.
		while(!charStack.isEmpty()){
			s.append(charStack.pop());//s = s + charStack.pop();
		}
		return s.toString();//StringBuffer to String		
	}
	
//	StringBuffer is better than String
	public static String reverseC3 (String str){
		Stack<Character> charStack = new Stack<Character>();
		for (char c : str.toCharArray()){
			charStack.push(c);
		}
		
		String s = new String();
		while(!charStack.isEmpty()){
			s = s + charStack.pop();
		}
		return s;		
	}
	
//	not use Stack
	public static String reverseC2 (String str){
		char[] c_array = str.toCharArray();
		int len = str.length();
		for (int i =0; i<len/2; i++){
			char head = c_array[i];//copy head
			c_array[i] = c_array[len-1-i];//assign head by end
			c_array[len-1-i] = head;//assign end by head
		}
//		String s2 = Arrays.toString(c_array); //the string include comma and [ ]
		return new String(c_array);
	}
	
//	test
	public static void main(String args[]){
		String test = "abcdefg 1234567";
		String a = reverseC1(test);
		String b = reverseC2(test);
		String c = reverseC3(test);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
}
