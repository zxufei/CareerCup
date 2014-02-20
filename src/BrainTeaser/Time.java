package BrainTeaser;
import java.util.*;
public class Time {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Date now = new Date();
			try {
			System.out.println(now.getHours()+":"+now.getMinutes()+":"+now.getSeconds());
			java.lang.Thread.sleep(1000L);
			} catch (Exception ex) {
			break;
			}
		}
	}
}

