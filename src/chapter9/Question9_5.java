package chapter9;

import java.util.ArrayList;
import java.util.Arrays;

public class Question9_5 {

	/**
	 * @param args
	 * Write a method to compute all permutations of a string
	 */
	public static ArrayList<String> permutationString(String s){
		if (s.length() == 0) return new ArrayList<String>(Arrays.asList(""));
		StringBuffer original_s = new StringBuffer(s);
		ArrayList<String> results = new ArrayList<String>();
	
		for (int i=0; i<s.length(); i++){
			original_s.deleteCharAt(i);

			for (String ss:permutationString(original_s.toString())){
				StringBuffer newString = new StringBuffer();
				newString.append(s.charAt(i));
				newString.append(ss);	
				results.add(newString.toString());
//				newString.delete(newString.length()-ss.length(),newString.length());
				//must delete previous ss for next loop of ss.
			}
			
			original_s.insert(i, s.charAt(i));
		}
		return results;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123";
		System.out.println(permutationString(s));
		System.out.print(permutationString(s).size());
	}

}
