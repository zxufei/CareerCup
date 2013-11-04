package dataStructure;


public class BinarySearchTree extends BinaryTree{

	/**
	 * @param args
	 */
	
//	protected TreeNode root;//inheritance
	
	public BinarySearchTree(){
		root = null;
	}
	
//	public TreeNode getRoot(){
//		return root;
//	}
	
	//Inheritance
//	//-----------size-------------

//		
//	//----------depth--------------------

//	//----------inorderPrint------------------

	
	//-------------insert-----------------------
	public void insert(int data){
		root = insert(root,data);
	}
	
	protected TreeNode insert(TreeNode rt, int data){
		if(rt == null){
			rt = new TreeNode(data);
		}
		else{
			if(data < rt.data){
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
		else if(rt.data < data){
			return search(rt.right, data);
		}
		else if(rt.data > data){
			return search(rt.left, data);
		}
		else return rt;
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
		
		else if(!child.equals(rt.left) && !child.equals(rt.right)){
			if(child.data < rt.data){
				return findParent(rt.left, child);
			}
			else return findParent(rt.right, child);
		}
		else return rt;
	}
	
	public TreeNode findParent(TreeNode child){
		return findParent(root,child);
	}
	
	
	//---------------delete-----------------------------------
	public void delete(int data){
		TreeNode target = search(data);
		TreeNode parent = findParent(root,target);
		//leaf
		if(target.left==null && target.right==null){
			if(target.data < parent.data){
				parent.left = null;
			}
			else parent.right = null;
		}
		//has only one child
		else if(target.left == null || target.right == null){
			//not root
			if(parent!=null){
				if(target.left == null){
					if(parent.data < target.data){
						parent.right = target.right;
					}
					else parent.left = target.right;
				}
				else {
					if(parent.data < target.data){
						parent.right = target.left;
					}
					else parent.left = target.left;
				}
			}
			//root
			else{
				if(target.left == null){
					target.data = target.right.data;
					if (target.right.right != null)
						target.right = target.right.right;
					if (target.right.left != null)
						target.left = target.right.left;
				}
				else{
					target.data = target.left.data;
					if(target.left.left != null)
						target.left = target.left .left ;
					if(target.left.right != null)
						target.right = target.left .right;
				}
			}
		}
		// has two child
		else{
			TreeNode point = target.left ;
			while (point.right != null){
				point = point.right;
			}
			int key = point.data;
			delete(point.data);
			target.data = key;
		}
		
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(6);
		bst.insert(10);
		bst.insert(7);
		bst.insert(2);
		bst.insert(1);
		bst.insert(5);
		bst.insert(11);
		bst.inorderPrint();
//		System.out.println(bst.searchBST(1).data);
		
		bst.delete(10);
		bst.inorderPrint();
		System.out.println(bst.size());
		

		
		
	}

}
