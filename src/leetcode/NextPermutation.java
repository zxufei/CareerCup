package leetcode;
import java.util.Arrays;


public class NextPermutation {

	/**
	 * @param args
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place, do not allocate extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1
http://fisherlei.blogspot.com/2012/12/leetcode-next-permutation.html
	 */
	public static void nextPermutation(int[] num) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
		
		//find first index violating ascending order from right to left
		int swap_index = -1;
        for (int i=num.length-1; i >0; i--){
        	if ( num[i] > num[i-1]){
        		swap_index = i-1;
        		break;
        	}	
        }
        //all num[] in descending order.
        if (swap_index == -1){
        	Arrays.sort(num);
        }
        else{
        	//find first  from right to left that larger than the violating number
        	int swap_index2 = -1;
        	for (int i= num.length-1; i > swap_index; i--){
        		if (num[i] > num[swap_index]){
        			swap_index2 = i;
        			break;
        		}
        	}
        	//swap num[swap_index2] and num[swap_index2]
        	int temp = 0;
        	temp = num[swap_index];
        	num[swap_index] = num[swap_index2];
        	num[swap_index2] = temp;
        	
        	//make ascending order from left to right begin from violating index
        	int shift_start = ++swap_index;
        	int i = shift_start;
        	while (i <= ( num.length-1 + shift_start)/2){
        		temp = num[i];
        		num[i] = num[num.length -1- (i-shift_start)];
        		num[num.length - 1 - (i-shift_start)] = temp;
        		i++;	
        	}
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,3,2};
		nextPermutation(A);
		System.out.print(Arrays.toString(A));
	}

}
