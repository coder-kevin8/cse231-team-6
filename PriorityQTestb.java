package edu.oakland.test;
import edu.oakland.helper.PQueue;
import junit.framework.*;	

public class PriorityQTestb extends TestCase {
	private int testResult;
	private int testResult2;
	private int evenPass = 802;
	private int evenPass2 = 806;
	private int[] arrayTest = {20, 705, 801, 802, 806, 914, 1002, 2056, 1724, 34, 29, 803};
	private long timeElapsed;
	private int[] resultArray;
	
	public void setUp(){
		PQueue pQueue = new PQueue(arrayTest);
		System.out.println("Searching for elements between 800 and 8000");
		resultArray = pQueue.getResults(800, 8000);
		testResult = resultArray[0];
		testResult2 = resultArray[1];
		System.out.println("The first element between 800 and 8000 is " + resultArray[0]);
		System.out.println("The second element between 800 and 8000 is " + resultArray[1]);
		timeElapsed = pQueue.getTime();
		System.out.println("The time elapsed was: "+timeElapsed+" milliseconds");
	}
	
	public void testPriorityQ() { 
	
		assertEquals(evenPass, testResult); //tests for the number we are searching for
		assertEquals(evenPass2, testResult2); //tests for the number we are searching for

	}		
}
