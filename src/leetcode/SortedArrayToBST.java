package leetcode;

import dataStructure.TreeNode;

public class SortedArrayToBST {

	/**
	 * @param args
	 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
	 */
	public TreeNode sortedArrayToBST(int[] num) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (num.length == 0) return null;
        TreeNode n = null;
        n = sortArray(0,num.length-1,num);
        return n;
    }
    public TreeNode sortArray(int head, int tail, int[]num){
        if (head > tail) return null ;
        int mid = (head + tail)/2;
        
        TreeNode tmp = new TreeNode(num[mid]);
        
        tmp.left = sortArray(head,mid-1,num);
        tmp.right = sortArray(mid+1,tail,num);
        return tmp;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
