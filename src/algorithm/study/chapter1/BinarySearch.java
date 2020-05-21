package algorithm.study.chapter1;

/**
 * 二分查找<br/>
 * 
 * 标准类型
 * 
 * @author Ji.huazhen
 *
 */
public class BinarySearch {

	public static int rank(int target, int[] nums) {

		int left = 0, right = nums.length - 1, mid = 0;

		while (left <= right) {
			mid = left + (right - left) / 2;
			if (target < nums[mid]) {
				right = mid - 1;
			} else if (target > nums[mid]) {
				left = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 11, 19 };
		int result = BinarySearch.rank(12, nums);
		System.out.println(result);

	}

}
