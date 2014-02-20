package leetcode;

public class StringToInteger {

	/**
	 * @param args
	 * Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. 
If you want a challenge, please do not see below and ask 
yourself what are the possible input cases.

Notes: It is intended for this problem to be specified 
vaguely (ie, no given input specs). 
You are responsible to gather all the input requirements up front.

spoilers alert... click to show requirements for atoi.

Requirements for atoi:
The function first discards as many whitespace characters as necessary until
 the first non-whitespace character is found. Then, starting from this character, 
 takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the 
integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral 
number, or if no such sequence exists because either str is empty or it contains only 
whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned. 
If the correct value is out of the range of representable values, 
INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
	 */
	
    public int atoi(String str) {
        int rs = 0;
        String astr = str.trim();
        if (astr.equals("")) return 0;
        
        char sign = astr.charAt(0);
        int signi = 1;
        int startIndex = 0;
        if (sign == '-') {
            signi = -1; 
            startIndex = 1;
        }
        else if (sign == '+'){
            signi = 1;
            startIndex = 1;
        }
        else{
            startIndex = 0;
        }
        
        for (int i=startIndex; i<astr.length(); i++){
            char c = astr.charAt(i);
            int singlenum = c -'0';
            if (singlenum <0 || singlenum >9) break;
            if (Integer.MAX_VALUE/10 < rs || (Integer.MAX_VALUE/10 == rs && Integer.MAX_VALUE%10 < singlenum)){
                if (signi == -1) return Integer.MIN_VALUE;
                else return Integer.MAX_VALUE;
            }
            rs = rs*10 + singlenum;
        }
        return rs*signi;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
