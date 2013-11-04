package leetcode;

import java.util.Arrays;

public class TwoSum {

	/**
	 * @param args
	 
	Given an array of integers, find two numbers such that they add up to a specific target number.
	The function twoSum should return indices of the two numbers such that they add up to the target, 
	where index1 must be less than index2. Please note that your returned answers (both index1 and index2) 
	are not zero-based.
	You may assume that each input would have exactly one solution.
	Input: numbers={2, 7, 11, 15}, target=9
	Output: index1=1, index2=2
	* 
	 */
	
	//O(n) method
	public static int[] twoSum(int[] numbers, int target) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
		int[] copy = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(copy);
        int head = 0, tail = numbers.length-1,i=0;
        int[] result = new int[numbers.length];
        while(head < tail){
        	if((copy[head] + copy[tail]) < target){
        		head++;
        	}
        	else if((copy[head] + copy[tail] > target)){
        		tail--;
        	}
        	else{
        		int index1 = findIndex(numbers,copy[head]);
        		int index2 = findIndex(numbers,copy[tail]);
        		if( index1 > index2){
        			result[i++] = index2;
        			result[i++] = index1;
        			head++;
	        		tail--;
        		}
        		else{
        			result[i++] = index1;
	        		result[i++] = index2;
	        		head++;
	        		tail--;
        		}
        	}
        }
        return result;
    }
	
	
	public static int findIndex(int[] arr, int target){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==target){
				arr[i] =-1;//if there are two same integer, when we find one we must update to -1
				return i+1;//must start from 1.
				}
			}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,9,4,4,56,90,3};
		int[] result = twoSum(arr,8);
//		for (int i=0; i<result.length;i++){
//			System.out.print(result[i]+" ");
//		}
//		System.out.println();
		System.out.println(Arrays.toString(result));
	}

}
