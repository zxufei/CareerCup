package chapter1;

import java.util.Arrays;
/** Question1.3
 * 4th
 * Write a method to decide if two strings are anagrams or not
 * 5th
 * Given two strings, write a method to decide if one is a permutation of the other.
 */

public class Question1_3 {
//	sort arrays of char. We can also write a function sort to sort the string.
	public static boolean isPermutation1(String str1, String str2){
		if (str1.length()!=str2.length()) return false;
		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		String astr = new String(a);
		String bstr = new String(b);
		if (astr.equals(bstr)) return true;
		else return false;
	}
//	method 2. record the occurrence of every character in the string. Then compare two records
	public static boolean isPermutation2(String str1, String str2){
		if (str1.length()!=str2.length()) return false;
		char[] set1 = countChar(str1);
		char[] set2 = countChar(str2);
		
		for (int i = 0; i<256; i++){
			if (set1[i]!=set2[i]) return false;
		}
		return true;
	}
	
	public static char[] countChar (String str){
		char[] set = new char[256];
		for (int i = 0; i<str.length(); i++){
			set[str.charAt(i)]++;
		}
		return set;
	}
	
//	method3 record one string occurrence and delete occurrence according to another string and check the number of occurrence
//	that is smaller than 0
	public static boolean isPermutation3(String str1, String str2){
		if (str1.length()!=str2.length()) return false;
		int [] set = new int[256];//count the number of occurrence in string
		for (int i =0; i< str1.length(); i++){
			set[str1.charAt(i)]++;
		}
		
		for (int i =0; i<str2.length(); i++){
			if(--set[str2.charAt(i)]<0) return false;
		}
		return true;
	}
	
	public static void main (String args[]){
		String s1 = "asdfg";
		String s2 = "gfdsa";
		String s3 = "sdeas";
		boolean result = isPermutation2(s1,s2);
		boolean result2 = isPermutation3(s1,s3);
		System.out.println(result);
		System.out.println(result2);
		
	}
}
