package leetcode;
import java.util.*;

public class UniqueBinarySearchTree {

	/**
	 * @param arg
	 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
		For example,
		Given n = 3, there are a total of 5 unique BST's.
		
		   1         3     3      2      1
		    \       /     /      / \      \
		     3     2     1      1   3      2
		    /     /       \                 \
		   2     1         2                 3
	 */
	/**
	 * 思路：递归，由于是二叉查找树，先选择任一结点根结点，假设为结点i，
	 * 则[1，i-1]范围的结点为结点i的左子树结点，[i+1，n]范围的结点为结点i的右子树结点，
	 * 则以结点i为根结点的BST个数为左，右子树可构成BST个数的乘积，基于这个思路，
	 * 可以写出以下递归程序。
	 * @param args
	 */
	
	 public int numTrees(int n) {
	        // IMPORTANT: Please reset any member data you declared, as
	        // the same Solution instance will be reused for each test case.
	        return numTrees(1,n);
	    }
	    
	 public int numTrees(int start, int end){
		 	int num=0;
	        if (start >= end) return 1;//start > end is also ok
	        for (int i=start; i<=end; i++){
	             num += numTrees(start,i-1)*numTrees(i+1,end);
	        }
	        return num;
	    }      
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
