package dsandalgos;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class InsertionSortArrayTest {

	@Test
	public void insertionSortTest() {
		int[] arr1 = { 5, 2, 3, 1 };
		int[] arr1Sorted = { 1, 2, 3, 5 };
		assertArrayEquals(arr1Sorted, InsertionSortArray.insertionSort(arr1));

		int[] arr2 = { 5, 1, 1, 2, 0, 0 };
		int[] arr2Sorted = { 0, 0, 1, 1, 2, 5 };
		assertArrayEquals(arr2Sorted, InsertionSortArray.insertionSort(arr2));

		int[] arr3 = { 5, 4, 10, 1, 6, 2 };
		int[] arr3Sorted = { 1, 2, 4, 5, 6, 10 };
		assertArrayEquals(arr3Sorted, InsertionSortArray.insertionSort(arr3));
	}

}
