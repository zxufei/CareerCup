package Interview;

public class HighFrequencyCharacter {

	/**amazon interview 3 huffman coding
	 * @param args
	 * input: abcdddddsaa
	 * output:d
	 */
	 class TreeNodeCoding{
		String value = null;
		int frequency = 0;
		TreeNodeCoding left = null;
		TreeNodeCoding right = null;
		public TreeNodeCoding(){
			
		}
		public TreeNodeCoding(String s, int i){
			value = s;
			frequency = i;
		}
	}
	
	public static  TreeNodeCoding HuffmanTree(String s){
		int[] count = new int[256];
		for (int i=0; i<s.length(); i++){
			count[s.charAt(i)] ++;
		}
		
		TreeNodeCoding first = findMax(count);
		TreeNodeCoding newone = findMax(count);
		HighFrequencyCharacter a = new HighFrequencyCharacter();
		TreeNodeCoding parent = a.new TreeNodeCoding(first.value+newone.value,first.frequency+newone.frequency);
		parent.left = first;
		parent.right = newone;
		while (!isClear(count)){
			newone = findMax(count);
			TreeNodeCoding newparent = a.new TreeNodeCoding(parent.value+newone.value,parent.frequency+newone.frequency);
			newparent.left = parent;
			newparent.right = newone;
			parent = newparent;
			
		}
		return parent;	
	}
	
	public static boolean isClear(int[] array){
		for(int i:array){
			if (i != 0) return false;
		}
		return true;
	}
	
	//find min
	public static TreeNodeCoding findMax(int[] array){
		int min_i=0, min = Integer.MAX_VALUE;
		for (int i=0; i<array.length; i++){
			if (array[i] < min && array[i]!=0){
				min = array[i];
				min_i = i;
			}
		}
		HighFrequencyCharacter a = new HighFrequencyCharacter();
		TreeNodeCoding n = a.new TreeNodeCoding(String.valueOf((char)min_i),min);
		array[min_i] = 0;
		return n;
	}
	
	public static void printCoding (TreeNodeCoding n){
//		TreeNodeCoding point = n;
//		while (point.left != null && point.right != null){
//			System.out.print("0");
//			point = point.left;
//		}
//		System.out.print(point.value);
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbcccd";
		TreeNodeCoding n = HuffmanTree(s);
		System.out.println(n.value+" "+n.frequency);
	}

}
