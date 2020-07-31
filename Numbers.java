import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
	
	public static int nextLargest (int array[],int element) {

		int nextLargestElem = Integer.MAX_VALUE;
		for (int x=0; x < array.length; x++) {
			if (array[x] > element) {
				nextLargestElem = array[x];
				break;
			}
		}
		return nextLargestElem;
}
	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int arraySize, array[], arraySort[];
		System.out.println ("Enter array size: ");
		
		arraySize = scan.nextInt();
		array = new int[arraySize];
		arraySort = new int[arraySize];
		System.out.println ("Enter elements of array: ");
		for (int x=0; x < arraySize; x++) {
			array[x] = scan.nextInt();
			arraySort[x] = array[x];
	}
		Arrays.sort(arraySort);
		System.out.println ("Output: ");

		for (int x=0; x < arraySize; x++) {
			int nextLargestElem = nextLargest(arraySort, array[x]);

		if (nextLargestElem != -1) {
			System.out.println (array[x]+": "+nextLargestElem);
			}
		
		else {
			System.out.println (array[x]);
			}
		}
	}
}