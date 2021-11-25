package dsandalgos;

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
