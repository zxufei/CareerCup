package Interview;

import java.util.*;

public class ReverseString {

	/**
	 * @param args
	 */
	
	//using Stack and charArray, one stack buffer
	public  static String ReverseStr(String s){
		char[] c_array = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char c : c_array){
			stack.push(c);
		}
		for (int i=0; i<c_array.length;i++){
			c_array[i] = stack.pop();
		}
		return String.valueOf(c_array);
	}
	
	//using Stack and stringBuffer, one stack buffer and one StringBuffer buffer
	public static String ReverseStr2(String s){
		Stack<Character> stack = new Stack<Character>();
		StringBuffer news = new StringBuffer();
		for (int i=0; i<s.length(); i++){
			stack.push(s.charAt(i));
		}
		for (int i=0; i<s.length(); i++){
			news.append(stack.pop());
		}
		return news.toString();
	}
	
	//using swap in-place, but need transfer string to charArray
	public static String ReverseStr3(String s){
		char[] a = s.toCharArray();
		for(int i=0; i<s.length()/2; i++){
			char temp = a[i];
			a[i] = a[s.length()-1-i];
			a[s.length()-1-i] = temp;
		}
		return String.valueOf(a);
	}
	
	//using a regular char array
	public static String ReverseStr4(String s){
		char[] n = new char[s.length()];//new char array to store reverse character
		for (int i=0;i < s.length();i++){
//			n[s.length()-1-i] = s.charAt(i);
			n[i] = s.charAt(s.length()-1-i);
		}
		return String.valueOf(n);
	}
		
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1112233452dgdsfer42423ddg";
		
		System.out.println(s);
		String news = ReverseStr3(s);
//		String news = ReverseStr4(s);
//		String news = ReverseStr2(s);
		System.out.println(news);
	}

}
