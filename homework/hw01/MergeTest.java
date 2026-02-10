package hw1;

import static org.junit.Assert.*;

import org.junit.Test;

//This is the junit test class
public class MergeTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
    public void testSortedArrays() {
        int[] arr1 = {1, 17, 23};
        int[] arr2 = {2, 10, 12};

        int[] expected = {1, 2, 10, 12, 17, 23};
        int[] actual = Merge.mergingSortedArrays(arr1, arr2);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFirstArrayEmpty() {
        int[] arr1 = {};
        int[] arr2 = {2,5,8};

        int[] expected = {2,5,8};
        int[] actual = Merge.mergingSortedArrays(arr1, arr2);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSecondArrayEmpty() {
        int[] arr1 = {5, 7, 10};
        int[] arr2 = {};

        int[] expected = {5, 7, 10};
        int[] actual = Merge.mergingSortedArrays(arr1, arr2);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testArraysWithDuplicates() {
        int[] arr1 = {1, 4, 4};
        int[] arr2 = {7, 9};

        int[] expected = {1, 4, 4, 7, 9};
        int[] actual = Merge.mergingSortedArrays(arr1, arr2);

        assertArrayEquals(expected, actual);
    }

}
