package leetcode;

import java.util.ArrayList;

public class Permutation {

	/**
	 * @param args
	 * Given a collection of numbers, return all possible permutations.
		For example,
		[1,2,3] have the following permutations:
		[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].Given a collection of numbers, 
		return all possible permutations.
		For example,
		[1,2,3] have the following permutations:
		[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
	 */
	
	 public static ArrayList<ArrayList<Integer>> permute(int[] num) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        ArrayList<Integer> nums = new ArrayList<Integer>();
	        for(int a:num){
	            nums.add(a);
	        }
	        return permute(nums);
	    }
	    
	    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> num){
	        if (num.size()==1) {
	            ArrayList<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>();
	            ArrayList<Integer> one = new ArrayList<Integer>();
	            one.add(num.get(0));
	            tmp.add(one);
	            return tmp;
	        }
	        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	        
	        for (int i=0;i<num.size();i++){
	            int tmp =num.get(i);
	            num.remove(i);
	            for (ArrayList<Integer> a:permute(num)){
	                ArrayList<Integer> newp = new ArrayList<Integer>();
	                newp.add(tmp);
	                for (int ele:a){
	                    newp.add(ele);
	                }
	                result.add(new ArrayList<Integer>(newp));
	            }
	            num.add(i,tmp);
	        }
	        return result;
	    }
	
	//http://blog.csdn.net/morewindows/article/details/7370155    
//	public static ArrayList<ArrayList<Integer>> permute2(int[] num){
//		
//	}
	
	public static void swap(int[] array, int i, int j ){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-1,1,0};
		System.out.println(permute(A));
	}

}
