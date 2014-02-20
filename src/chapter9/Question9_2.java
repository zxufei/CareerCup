package chapter9;

public class Question9_2 {

	/**
	 * @param args
	 * Imagine a robot sitting on the upper left corner of an X by Y grid. The robot
	 * can only move in two directions: right and down. How many possible paths
	 * are there for the robot to go from (0,0) to (x,y)?
	 * FOLLOW UP
	 * Imagin certain spots are "off limits", such that the robot cannot step on them.
	 * Design an algorithm to find a path for the robot from the top left to the bottom right.
	 */
	public static int sumPath(int x, int y){
//		if (x < 0 || y < 0 ) return 0;
	    if (x == 0 && y == 0) return 1;
		else if (x == 0) return sumPath(x, y-1);
		else if (y == 0) return sumPath(x-1,y);
		else return sumPath(x-1,y) + sumPath(x, y-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumPath(2,2));
	}

}
