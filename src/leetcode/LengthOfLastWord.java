package leetcode;

import java.util.ArrayList;

public class LengthOfLastWord {

	/**
	 * @param args
	 * Given a string s consists of upper/lower-case alphabets
	 *  and empty space characters ' ', return the length of last word in the string.
	 *  If the last word does not exist, return 0.
Note: A word is defined as a character sequence consists of non-space characters only.
For example, 
Given s = "Hello World",
return 5.
	 */
    public static int lengthOfLastWord(String s) {
        ArrayList<String> listS = new ArrayList<String>();
        StringBuffer sb = new StringBuffer();
        String st = s.trim();
        for (int i=0; i<st.length(); i++){
            
            if (st.charAt(i) != ' '){
                sb.append(st.charAt(i));
            }
            else{
                listS.add(sb.toString());
                sb.delete(0,sb.length());
            }
        }
        //add last words
        listS.add(sb.toString());
        sb.delete(0,sb.length());
        if (listS.size() == 0) return 0;
        else return listS.get(listS.size()-1).length();
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = " agg  sd dddss  3";
		System.out.println(lengthOfLastWord(a));
	}

}
