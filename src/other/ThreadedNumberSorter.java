package other;

import java.awt.List;
import java.util.Random;

public class ThreadedNumberSorter {
	static final int TOTAL_NUMS = 10000;
	
	 

	//Complete the method below so that it uses threads to sort the integer array.
	//Try to get the completion time as short as possible.
	//Use the printArray method to check sorting accuracy
	public static void parallelSort(int[] nums) {
		long startTime = System.nanoTime();
		//Complete this method starting at this point
		Thread t1 = new Thread(()->{ 
			
			
			
			
			
			for(long i = 0; i < 2500; i++) {
			for(long j = 0; j < 2500; i++) {
				if(nums)
			}
		} });
		Thread t2 = new Thread(()->{ for(long i = 2500; i < 5000; i++) {
			
		} });
	Thread t3 = new Thread(()->{ for(long i = 5000; i < 7500; i++) {
	
		} });
	Thread t4 = new Thread(()->{ for(long i = 7500; i < 10000; i++) {
	
		} });
		
		long totalTime = System.nanoTime() - startTime;
		double timeInSeconds = (double)totalTime / 1_000_000_000;
		System.out.println("The total computing time in seconds was: " + timeInSeconds);
	}

	public static void main(String[] args) {
		int[] nums = new int[TOTAL_NUMS];

		Random randGen = new Random();
		for (int i = 0; i < TOTAL_NUMS; i++) {
			nums[i] = randGen.nextInt(TOTAL_NUMS);
		}

		//printArray(nums);
		parallelSort(nums);
		//printArray(nums);
	}
	
	private static void printArray(int[] nums){
		for(int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
		}
	}
	
	public static List sortNum(List num){
		
	}
}
