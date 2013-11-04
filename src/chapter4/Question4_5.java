package chapter4;
import dataStructure.*;

public class Question4_5 {

	/**
	 * 4.5 Implement a function to check if a binary tree is a binary search tree.
	 */
	
	//in-order traversal method 
	private static int index = 0;
	public static void inorderToArray(int[] array, TreeNode rt){
		if(rt!=null){
			inorderToArray(array,rt.left);
			array[index] = rt.data;
			index++;
			inorderToArray(array,rt.right);
		}
	}
	
	public static boolean isBST1(BinaryTree t){
		int[] array = new int[t.size()];
		inorderToArray(array,t.getRoot());
		for(int i=0; i<array.length-1; i++){
			if(array[i] > array[i+1]) return false;
		}
		return true;	
	}
	
	
	//recursion method, like in-order method
	private static int previous_data = Integer.MIN_VALUE;
	public static boolean isBST2(TreeNode rt){
		if(rt == null) return true;
		if(!isBST2(rt.left)) return false;
		if(previous_data > rt.data) return false;
		previous_data = rt.data;
		if(!isBST2(rt.right)) return false;
		return true;
	}
	
	public static boolean isBST2(BinaryTree t){
		return isBST2(t.getRoot());
	}
	
	
	//min max method
	public static boolean isBST3(TreeNode rt, int min, int max){
		if(rt == null) return true;
		if(rt.data <= min || rt.data > max) return false;
		if(!isBST3(rt.left,min,rt.data) || !isBST3(rt.right,rt.data,max))
			return false;
		return true;
	}
	
	public static boolean isBST3(BinaryTree t){
		return isBST3(t.getRoot(),Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
