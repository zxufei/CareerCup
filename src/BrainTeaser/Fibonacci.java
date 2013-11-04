package BrainTeaser;
import java.util.*;
public class Fibonacci {

	/**
	 * @param args
	 * 斐波那契数列指的是这样一个数列 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
		这个数列从第三项开始，每一项都等于前两项之和。
		数列的输出形式  每5个为一行， 一共输出30个数 即
		
		0     1     1      2     3
		5     8     13   21    34
		55   89   144 .... ... .... 
	 */
	//recursion
	public static int fibonacci(int i){
		if (i == 1) return 0;
		else if (i == 2) return 1;
		else return fibonacci(i-1) + fibonacci(i-2);
	}
	
	//store in a list and print Fibonacci every line have five numbers.
	public static void printFib(int number){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		System.out.print(list.get(0)+" "+list.get(1)+" ");
		for (int i=2;i<number; i++){
			int temp = list.get(i-1)+list.get(i-2);
			list.add(temp);
			if ((i+1)%5 ==0){
				System.out.println(temp+" ");
			}
			else System.out.print(temp+" ");
		}
	}
	
	//just print
	public static void printFib2(int n){
		System.out.print(0+" "+1+" ");
		int a=0,b=1;
		for (int i=2; i<n; i++){
			int c = a+b;
			if ((i+1)%5 ==0){
				System.out.println(c+" ");
			}
			else System.out.print(c+" ");
			a = b;
			b = c; 
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(fibonacci(30));
		printFib2(30);
	}

}
