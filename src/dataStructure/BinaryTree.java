package dataStructure;


public class BinaryTree {

	/**
	 * @param args
	 */
	class WrapInt{
		int value = 0;
	}
	protected TreeNode root;
	
	
	
	public BinaryTree(){
		root = null;
	}
	
	public TreeNode getRoot(){
		return root;
	}
	
	//-----------size-------------
	protected void size(TreeNode rt, WrapInt c){
		if(rt != null){
			size(rt.left,c);
			c.value++;
			size(rt.right,c);
		}
	}
	
	public int size(){
		WrapInt i = new WrapInt();
		size(root,i);
		return i.value;
	}
	
	//----------depth--------------------
	protected int depth(TreeNode rt){
		if(rt == null) return 0;
		return Math.max(depth(rt.left), depth(rt.right))+1;
	}
	
	public int depth(){
		return depth(root);
	}
	
	
	//-------------insert-----------------------
	public void insert(int data){
		root = insert(root,data);
	}
	
	protected TreeNode insert(TreeNode rt, int data){
		if(rt == null){
			rt = new TreeNode(data);
		}
		else{
			int random = (int) ((Math.random()*10)%2);
			if(random == 1){
				rt.left = insert(rt.left, data);
			}
			else{
				rt.right = insert(rt.right, data);
			}
		}
		return rt;
	}
	
	
	//------------search-----------------------------
		public TreeNode search(int data){
			TreeNode t = search(root,data);
			return t;
		}
		
		protected TreeNode search(TreeNode rt, int data){
			if(rt == null){
				return null;
			}
			else if(rt.data == data){
				return rt;
			}
			else{
			TreeNode left = search(rt.left, data);
			if (left != null) return left;
			TreeNode right = search(rt.right, data);
			if (right != null) return right;
			}
			return null;
		}
	
		
	//-----------findParent-------------------------
		protected TreeNode findParent(TreeNode rt, TreeNode child){
			if(rt == null){
				return null;
			}
			// check the child we want to find whether is root or not, if yes, return null, no parent.
			else if(rt.equals(child)){
				return null;
			}
			
			else if(child.equals(rt.left) || child.equals(rt.right)){
				return rt;
			}
			
			else{
				TreeNode left = findParent(rt.left, child);
				if (left != null) return left;
				TreeNode right = findParent(rt.right, child);
				if (right != null) return right;
				return null;
			}
		}
		
		public TreeNode findParent(TreeNode child){
			return findParent(root,child);
		}
	
	//----------inorderPrint------------------
	public void inorderPrint(){
		if(root!=null){
		inorder(root);
		System.out.println();
		}
	}
	
	protected void inorder(TreeNode rt){
		if(rt!=null){
		inorder(rt.left);
		System.out.print(rt.data + " ");
		inorder(rt.right);
		}
	}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree bst = new BinaryTree();
		bst.insert(6);
		bst.insert(10);
		bst.insert(7);
		bst.insert(2);
		bst.insert(1);
		bst.insert(5);
		bst.insert(11);
		bst.inorderPrint();
		System.out.println(bst.findParent(bst.search(2)).data);
		
		
//		bst.delete(10);
		
//		bst.inorderPrint();

		
		
	}

}
