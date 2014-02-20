package chapter9;

public class Question9_1 {

	/**
	 * @param args
	 * A child is running up a staircase with n steps, and can hop either 1 step, 2steps,
	 * or 3 steps at a time. Implement a method to count how many possible ways 
	 * the child can run up the stairs.
	 */
	//recursion
	public static int WaysRunUp (int steps){
		if (steps < 0) return 0;
		else if (steps == 0) return 1;
		else return WaysRunUp(steps-1)+WaysRunUp(steps-2)+WaysRunUp(steps-3);
		//first steps is one or two or three
		//second steps may be also one or two or three
	}
	
	//non-recursion f(1) =1 f(2) =2 f(3) = 4 f(4)=f(1)+f(2)+f(3)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(WaysRunUp(4));
	}

}
