package chapter3;

public class Question3_1 {

	/**
	 * @param args
	 * Describe how you could use a single array to implement three stacks
	 */
	
	public int[] array;
	private int count1, count2, count3;
	
	public Question3_1(int length){
		array = new int[length];
		count1 = count2 = count3 = 0;
	}
	
	public void push(int data, int stacknum){
		int length = array.length;
		if(stacknum==1){
			if(count1 == length/3) System.out.println("Stack1 is full");
			else{
				array[count1++]=data;
			}
			
		}
		if(stacknum==2){
			if(count2 == length/3) System.out.println("Stack2 is full");
			else{
				array[count2+length/3] = data;
				count2++;
			}
			
		}
		if(stacknum==3){
			if(count3 == (length/3+length%3)) System.out.println("Stack3 is full");
			else{
				array[count3+2*length/3] = data;	
				count3++;
			}
		}	
	}
	
	public int pop(int stacknum){
		int length = array.length;
		if (stacknum==1){
			if(count1!=0){
				return array[--count1];
			}
			else {
				System.out.println("Stack1 is empty!");
				return (Integer)null;
			}
		}
		else if (stacknum==2){
			if(count2!=0){
				return array[--count2+length/3];
				
			}
			else {
				System.out.println("Stack2 is empty!");
				return (Integer)null;
			}
		}
		else {
			if(count3!=0){
				return array[--count3 + 2*length/3];
			}
			else {
				System.out.println("Stack3 is empty!");
				return (Integer)null;
			}
		}
	}
	
	public void print(){
		int length = array.length;
		for(int i=0; i<length; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question3_1 threeS = new Question3_1(24);
		for(int i=0; i<3; i++){
			threeS.push(i, 1);
			threeS.push(i, 2);
			threeS.push(i, 3);
		}
		threeS.print();
		threeS.push(88, 3);
	
		threeS.push(99, 3);
		threeS.pop(3);
		threeS.push(100, 3);
		threeS.push(2345, 2);
		threeS.pop(2);
		threeS.push(23, 2);
		threeS.print();
		
		
	}

}
