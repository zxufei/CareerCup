package Interview;

public class PascalTriangle {

	/**
	 * @param args
	 * Write a Java application that prints the first 10 lines of Pascals Triangle.
	 * http://learn-java-by-example.com
	 */
	//method1
	public static int[] pascalRow (int[] previous){
		int rowlength = previous.length+1;
		int[] row = new int[rowlength];
		
		row[0] = 1;//head
		row[rowlength-1] = 1;//tail
		//middle
		for (int i=1; i<rowlength-1; i++){
			row[i]=previous[i-1]+previous[i];
		}
		return row;
	}
	
	public static void printPascal(int lines){
		int[] row = new int[0];//initialize
		
		for (int i=0; i< lines; i++){
			row = pascalRow(row);
			//padding
			for (int j=0; j< lines-i; j++){
				System.out.print(" ");
			}
			for (int j=0; j< row.length; j++){
				System.out.print(row[j]+" ");
			}
			System.out.println();
		}
	}
	
	//method2
	public static void Pascal(int line){
		if (line == 0) System.out.println("No pascal trianlge displayed.");
		int[] row = new int[0];
//		int[] pre = new int[0];
		int [] pre = row.clone();
		for (int i=0; i<line; i++){	
			row = new int[i+1];
			row[0]= row[i] =1;
			for(int j=1;j<i; j++){
				row[j] = pre[j-1]+pre[j];	
			}
			printArray(row,line);
//			pre = new int[i+1];
//			pre = Arrays.copyOf(row, row.length);
			pre = row.clone();
		
		}
	}
	
	public static void printArray(int[] row,int line){
		//padding
		for (int i=0; i<line-row.length;i++){
			System.out.print(" ");
		}
		for(int i=0; i<row.length; i++){
			System.out.print(row[i]+" ");	
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printPascal(6);
		Pascal(1);
		
		
	}

}
