package dsandalgos;

/**
 * <p>
 * Sorts array in ascending order using insertion sort method. Splits array into
 * two sides - sorted on the left and unsorted on the right. We begin the outer
 * loop at index = 1 and consider the 0 index to be the sorted array. As the
 * outer loop increments, an inner loop decrements (moves to the left). The
 * outer loop element is compared to each element to the left. When a value is
 * found less than it, the outer loop element is inserted to the inner index +
 * 1.
 * <p>
 * <p>
 * Time complexity <br>
 * Worst case scenario is O(n^2) when the list is sorted in descending order.
 * Best case scenario is O(n) when the list is already sorted in ascending
 * order.
 * <p>
 * 
 * @author Meghan Boyce
 */
public class InsertionSortArray {

	public static void main(String[] args) {
		int[] nums1 = { 5, 4, 10, 1, 6, 2 };

		for (int i : insertionSort(nums1)) {
			System.out.println(i);
		}
	}

	public static int[] insertionSort(int[] nums) {
		int n = nums.length;

		for (int i = 1; i < n; i++) {
			int temp = nums[i];
			int j = i;

			while (j > 0 && temp < nums[j - 1]) {
				nums[j] = nums[j - 1];
				j--;
			}
			nums[j] = temp;
		}
		return nums;
	}

}
