package leetcode;
import java.util.*;
public class PascalTriangle {

	/**
	 * @param args
	 * Given numRows, generate the first numRows of Pascal's triangle.
For example, given numRows = 5,
Return
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
	 */
	
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (numRows == 0) return result;
        //first line
        ArrayList<Integer> row = new ArrayList<Integer>(Arrays.asList(1));
		ArrayList<Integer> pre = (ArrayList<Integer>) row.clone();
        result.add((ArrayList<Integer>)row.clone());
        //start at line2
        for (int i=1; i<numRows; i++){
            row.clear();
            row.add(1);
            for (int j=1; j<i; j++){
                int tmp = pre.get(j-1) + pre.get(j);
                row.add(tmp);
            }
            row.add(1);
            result.add((ArrayList<Integer>)row.clone());
            pre.clear();
            pre.addAll(row);
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
