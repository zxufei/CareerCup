package leetcode;

import java.util.Arrays;

public class ScrambleString {

	/**
	 * @param args
	 * Given a string s1, we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.

Below is one possible representation of s1 = "great":

    great
   /    \
  gr    eat
 / \    /  \
g   r  e   at
           / \
          a   t
To scramble the string, we may choose any non-leaf node and swap its two children.

For example, if we choose the node "gr" and swap its two children, it produces a scrambled string "rgeat".

    rgeat
   /    \
  rg    eat
 / \    /  \
r   g  e   at
           / \
          a   t
We say that "rgeat" is a scrambled string of "great".

Similarly, if we continue to swap the children of nodes "eat" and "at", it produces a scrambled string "rgtae".

    rgtae
   /    \
  rg    tae
 / \    /  \
r   g  ta  e
       / \
      t   a
We say that "rgtae" is a scrambled string of "great".

Given two strings s1 and s2 of the same length, determine if s2 is a scrambled string of s1.
	 */
	
	
    public static boolean isScramble(String s1, String s2) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        //using recursion
        //http://www.cnblogs.com/TenosDoIt/p/3452004.html
        return isScrambleRecur(s1,s2);
    }
    
    //using recursion
    //first partition words including every situations and then compare two substring if 
    //the substring themself is identical or the flip is identical
    public static boolean isScrambleRecur(String s1, String s2){
        if (s1.length() != s2.length()) return false;
        
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        //if two arrays have different characters, return false
        if (!Arrays.equals(c1,c2)) return false;
        //if two string is same return true
        if (s1.equals(s2)) return true;
        
        //start partition
        //length must >=2, otherwise cannot jump into loop
        for (int i=1; i<s1.length(); i++){
            String s1Left = s1.substring(0,i);//inclusive,exclusive
            String s1Right = s1.substring(i);
            String s2Left = s2.substring(0,i);
            String s2Right = s2.substring(i);//number of i before.
            
            //flip substring
            String s2FLeft = s2.substring(0,s2.length()-i);//len-i
            String s2FRight = s2.substring(s2.length()-i);//so len-i 
            
            if (isScrambleRecur(s1Left,s2Left) && isScrambleRecur(s1Right,s2Right)) return true;
            if (isScrambleRecur(s1Left,s2FRight) && isScrambleRecur(s1Right,s2FLeft)) return true;
        }
        return false;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="ab", s2 = "ba";
		System.out.println(isScramble(s1,s2));
		
		
	}

}
