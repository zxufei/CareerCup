package dataStructure;

public class TreeNode {

	/**
	 * @param args
	 */
	public int data;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(){
		this(0,null,null);
	}
	
	public TreeNode(int d){
		this(d,null,null);
	}
	
	public TreeNode(int d, TreeNode l, TreeNode r)
	{
		data = d;
		left = l;
		right = r;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
