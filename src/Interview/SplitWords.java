package Interview;


public class SplitWords {

	/**
	 * @param args
	 * Split words in a given string, words between quotes are considered as one word
	 */
	
	public static String[] splitWords (String s){
//		ArrayList<String> as = new ArrayList<String>();
		String[] as= new String[s.length()];
		int count = 0;
		StringBuffer sb = new StringBuffer();
		s = s.trim();
		for(int i=0; i< s.length(); i++){
			if (s.charAt(i) != ' '){
				sb.append(s.charAt(i));
			}
			else{
				as[count++] = sb.toString();
				sb.delete(0, sb.length());//clear
			}
		}
		as[count++] = sb.toString();
		sb.delete(0, sb.length());//clear
		return as;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String s = "Hello world! Let's change world and split word example.";
		String[] a = splitWords(s);
		for (String n: a){
		System.out.print(n+"----");
		}
	}

}
