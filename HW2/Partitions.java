package hw2;

public class Partitions {
	public static int lomuto(int[] arr) {
		
		if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            return 0;
        }
        
		//Pivot based on last element
	    int pivot = arr[arr.length - 1];
	    int i = -1;

	    for (int j = 0; j < arr.length - 1; j++) {
	    	//Swap if current element is less than pivot
	        if (arr[j] < pivot) {
	            i++;
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }

	    // Place pivot in the correct position with this swap
	    int temp = arr[i + 1];
	    arr[i + 1] = arr[arr.length - 1];
	    arr[arr.length - 1] = temp;

	    return i + 1; 
	}
	
	public static int hoare(int[] arr) {
		
		if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            return 0;
        }
		//Pivot based on starting element
	    int pivot = arr[0];
	    int i = -1;
	    int j = arr.length;

	    while (true) {
	    	//Find an element larger than the pivot from the left side
	        do {
	            i++;
	        } while (arr[i] < pivot);
	        
	        //Find an element smaller than the pivot from the right side
	        do {
	            j--;
	        } while (arr[j] > pivot);
	        
	        //End loop when i and j are at the same element or go past the halfway point
	        if (i >= j) {
	            return j;
	        }
	        //Swap smallest and largest elements
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	}

		
	
		
		
}


