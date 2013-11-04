package dataStructure.sort;

public class SelectSort {

	/**
	 * @param args
	 */
	public static void selectSort(int[] unsortList){
		int min = 0;
		int pos = 0;
		int temp = 0;
		for (int i = 0; i<unsortList.length; i++ ){
			min = unsortList[i];
			for(int j = i+1; j< unsortList.length; j++){
				if ( min > unsortList[j]){
					pos = j;
					min = unsortList[j];
				}
			}
			//swap
			temp = unsortList[i];
			unsortList[i] = min;
			unsortList[pos] = temp;
		}
//		return unsortList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[20];
		for(int i = 0; i< 20; i++){
			test[i] = (int)(Math.random()*100);
		}
		for (int i = 0; i<20; i++){
			System.out.print(test[i]);
			System.out.print(" ");
		}
		
		selectSort(test);
		System.out.println();
		for (int i = 0; i<20; i++){
			System.out.print(test[i]);
			System.out.print(" ");
		}
		
	}

}
