package chapter5;

public class BitManipulation {

	/**
	 * @param args
	 * the basic bit manipulation we must know
	 */
	
	//get ith bit. & 00010000 make other bits 0 except the bit we want to get.
	public boolean getBit(int num, int i){
		return ((num & (1 << i)) !=0);
	}
	
	//set ith Bit. | 0001000 make only that bit change.
	public int setBit(int num, int i){
		return (num | 1<<i);
	}
	
	//clear ith bit.  & 11101111, make that bit 0.
	public int clearBit(int num, int i){
		int mask = ~(1<<i);
		return (num & mask);
	}
	
	//clear all bits from the most significant bit through i(inclusive).
	public int clearBitLeftThroughI(int num, int i){
		int mask = 1 << i -1;
		return num & mask;
		
	}
	
	//clear all bits from i through 0 include i
	public int clearBit0ThroughI(int num, int i){
		int mask = ~(1 << (i+1) -1);
		return num & mask;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
