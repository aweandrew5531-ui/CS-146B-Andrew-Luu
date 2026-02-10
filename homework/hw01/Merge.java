package hw1;

public class Merge {
	public static int[] mergingSortedArrays (int arr1[], int arr2[]) {
		//Initialize the final merged array
		int result[] = new int [arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		/*
		 * Compares elements of the two arrays. Add the smallest
		 * element into the final array until one array is done
		 */
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				result[k] = arr1[i];
				k++;
				i++;
			}
			else {
				result[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		/*
		 * Add the remaining elements of array 1 into
		 * the final array if array 2 finishes first
		 */
		while (i < arr1.length) {
			result[k] = arr1[i];
			k++;
			i++;
		}
		
		/*
		 * Add the remaining elements of array 2 into
		 * the final array if array 1 finishes first
		 */
		while (j < arr2.length) {
			result[k] = arr2[j];
			k++;
			j++;
		}
		
		return result;
	}
}


