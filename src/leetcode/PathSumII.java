package leetcode;
import dataStructure.*;

import java.util.*;
public class PathSumII {

	/**
	 * @param args
	 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
	 * For example:
	 * Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
        return
		[
		   [5,4,11,2],
		   [5,8,4,5]
		]
	 */
	
	
	
	/**
	 * Definition for binary tree
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 * 
	 * List<Card> cardsList = Arrays.asList(hand);
	 * If you want an arraylist, you can do
	 * ArrayList<Card> cardsList = new ArrayList<Card>(Arrays.asList(hand));
	 */
	public static ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
	        // Note: The Solution object is instantiated only once and is reused by each test case.
		   ArrayList<Integer> path = new ArrayList<Integer>();
		   ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>(); 
		   
		   //if no root
		   if (root == null){
			   return paths;//must be[] not [[]]
		   }
		   else{
			   pathRecur(root,sum,path,paths);
		   }
		   return paths;
	   }
	        
	
	   
	   public static void pathRecur(TreeNode node, int sum,
			   ArrayList<Integer> path,ArrayList<ArrayList<Integer>> paths){
		   if (node == null) return;
		   
//		   try{
//			   path.set(level, node.data);
//		   }catch(Exception e){
			   path.add(node.data);
//		   }
		   
		   //if recursion to the leaf
		   if (node.left == null && node.right == null){
			   int s = 0;
			   for(int i=0; i<path.size(); i++) s += path.get(i);
//			   if (s == sum) paths.add(new ArrayList<Integer>(path.subList(0, level+1)));
			   if (s == sum) paths.add(new ArrayList<Integer>(path));
		   }
		   
		   pathRecur(node.left,sum,path,paths);
		   pathRecur(node.right,sum,path, paths); 
		   path.remove(path.size()-1);//if remove ,can add complete path .make sure new a new object path.
		   // if don't remove, we must update level information to new value, and calculate sublist of sum.
		   }
		   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(1);
		bst.getRoot().left = new TreeNode(0);
		bst.getRoot().right = new TreeNode(1);
//		bst.insert(10);
//		bst.insert(7);
//		bst.insert(2);
//		bst.insert(1);
//		bst.insert(5);
//		bst.insert(11);
		ArrayList<ArrayList<Integer>> paths = pathSum(bst.getRoot(),1);
		System.out.print(paths);

	}

}
