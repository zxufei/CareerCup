package leetcode;
/**
 * 
 * @author xufeizhao
 *
 *Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2.
 * (each operation is counted as 1 step.)
 * You have the following 3 operations permitted on a word:
 * a) Insert a character b) Delete a character c) Replace a character
 * http://gongxuns.blogspot.com/2012/12/edit-distance-given-two-words-word1.html
 * http://fisherlei.blogspot.com/2012/12/leetcode-edit-distance.html
 * Algorithm PPT
 */
public class EditDistance {
	
	
	//two dimession of dp
    public static int minDistance(String word1, String word2) {
        int add = 1, delete = 1, replace = 1;
        int m = word1.length(), n = word2.length();
        int [][] distance = new int[m+1][n+1];
        distance[0][0] = 0;
        //index 0 col
        for (int i=1; i<=m; i++) distance[i][0] = i;
        //index 0 row
        for (int i=1; i<=n; i++) distance[0][i] = i;
        
        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                if (word1.charAt(i-1)==word2.charAt(j-1)){
                    distance[i][j] =  distance[i-1][j-1];
                }
                else{
                    int min = Math.min(distance[i-1][j-1]+replace,distance[i][j-1]+add);
                    min = Math.min(distance[i-1][j]+delete,min);
                    distance[i][j] = min;
                }
            }
        }
        return distance[m][n];
    }	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "aac"; 
		String word2 = "aad";
		System.out.println(minDistance(word1,word2));
	}

}
