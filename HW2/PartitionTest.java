package hw2;

import org.junit.Test;
import static org.junit.Assert.*;


public class PartitionTest {

    @Test
    public void testLomutoSorted() {
        int[] arr = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};
        checkLomuto(arr);
    }

    @Test
    public void testLomutoEmpty() {
        int[] arr = {};
        checkLomuto(arr);
    }

    @Test
    public void testLomutoRandom() {
        int[] arr = {84, 3, 7, 1, 9, 6, 2, 5};
        checkLomuto(arr);
    }

    private void checkLomuto(int[] arr) {
    	if (arr.length == 0) {
    		return;
    	}
        int pivotIndex = Partitions.lomuto(arr);
        int pivot = arr[pivotIndex];
        /*
         * Checks if elements left of the pivot are smaller and
         * if elements right of the pivot are greater than the pivot
         */
        
        for (int i = 0; i < pivotIndex; i++) {
            assertTrue(arr[i] <= pivot);
        }
        for (int j = pivotIndex + 1; j < arr.length; j++) {
            assertTrue(arr[j] >= pivot);
        }
        
    }

    @Test
    public void testHoareSorted() {
        int[] arr = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};
        checkHoare(arr);
    }

    @Test
    public void testHoareEmpty() {
        int[] arr = {};
        checkHoare(arr);
    }

    @Test
    public void testHoareRandom() {
        int[] arr = {84, 3, 7, 1, 9, 6, 2, 5};
        checkHoare(arr);
    }

    private void checkHoare(int[] arr) {
        if (arr.length == 0) {
        	return;  
        }
        int pivot = arr[0];
        int pivotIndex = Partitions.hoare(arr);
        
        //Checks of elements left of pivot are smaller than pivot
        for (int i = 0; i <= pivotIndex; i++) {
            assertTrue(arr[i] <= pivot);
        }
        //Checks if elements right of pivot are bigger 
        for (int i = pivotIndex + 1; i < arr.length; i++) {
            assertTrue(arr[i] >= pivot);
        }

        
    }
}
