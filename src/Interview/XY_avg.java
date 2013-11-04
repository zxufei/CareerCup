package Interview;

public class XY_avg {

	/**
	 * @param args
	 * N is a constant
M is a constant
N is always greater than M
x is a fixed array of N elements (x[0], x[1], etc)


y[0] is the average of the first M elements starting from x[0].
y[1] is the average of the next M elements starting from x[1].
y[2] is the average of the next M elements starting from x[2].
and so on.
Can you write a program which will calculate all values of y[]?
	 */
	public static double[] avgXY1 (int[] x, int M){
		//O(n^2)
		double [] y=new double[x.length-M+1];
		for (int j =0; j< x.length-M+1; j++){
			int tmp = 0;
			for (int i=j; i< M+j; i++)
				tmp = tmp + x[i];
			y[j] = (double)tmp/(double)M;
		}
		
		return y;
	}
	//O(n)
	public static double[] avgXY2(int[] x, int M){
		double [] y = new double[x.length-M+1];
		int tmp = 0;
		for (int i=0; i< M; i++){
			tmp = tmp + x[i];
		}
		y[0] = (double)tmp/(double)M;
		
		for (int j = 1; j< x.length-M+1; j++){
			 y[j] = (double)(y[j-1]*M-x[j-1]+x[j-1+M])/(double)M;
		}
		return y;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M = 2;
		int[] x = new int[5];
		double[] y = new double[5-M+1];
		double[] y1 = new double[5-M+1];
		for(int i = 0; i< 5; i++){
			x[i] = (int)(Math.random()*100);
		}
		
		for (int i = 0; i<5; i++){
			System.out.print(x[i]);
			System.out.print(" ");
		}
		y = avgXY1(x,M);
		y1 = avgXY2(x,M);
		
		System.out.println();
		for (int i = 0; i<4; i++){
			System.out.print(y[i]);
			System.out.print(" ");
		}
		System.out.println();
		for (int i = 0; i<4; i++){
			System.out.print(y1[i]);
			System.out.print(" ");
		}

	}

}
