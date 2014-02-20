package leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class PermutationII {

	/**
	 * @param args
	 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.

For example,
[1,1,2] have the following unique permutations:
[1,1,2], [1,2,1], and [2,1,1].
	 */
    public static ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
       for(int a:num){
           nums.add(a);
       }
       return permutation(nums);
   }
   public static ArrayList<ArrayList<Integer>> permutation(ArrayList<Integer> num){
       if (num.size()==1) {
           ArrayList<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>();
           ArrayList<Integer> one = new ArrayList<Integer>();
           one.add(num.get(0));
           tmp.add(one);
           return tmp;
       }
       HashSet<ArrayList<Integer>> resultSet= new HashSet<ArrayList<Integer>>();
       for (int i=0;i<num.size();i++){
           int tmp =num.get(i);
           num.remove(i);
           for (ArrayList<Integer> a:permutation(num)){
               ArrayList<Integer> newp = new ArrayList<Integer>();
               newp.add(tmp);
               for (int ele:a){
                   newp.add(ele);
               }
               resultSet.add(new ArrayList<Integer>(newp));
           }
           num.add(i,tmp);
       }
       ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(resultSet);
       return result;
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> a1 = new ArrayList<Integer>();
//		a1.add(1);
//		a1.add(2);
//		a1.add(3);
//		ArrayList<Integer> a2 = new ArrayList<Integer>();
//		a2.add(1);
//		a2.add(2);
//		a2.add(3);
//		
//		System.out.println(a1.equals(a2));
//		System.out.println(a1.hashCode());
//		System.out.println(a2.hashCode());
//		
//		HashSet<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();
//		hs.add(a1);
//		hs.add(a2);
//		System.out.println(hs.size());
		
		
		int[] test = {1,3,2,4};
		ArrayList<ArrayList<Integer>> result = permuteUnique(test);
		System.out.println(result);
		
		
	}

}
