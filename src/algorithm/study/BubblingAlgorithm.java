package algorithm.study;

/**
 * 冒泡算法
 * 
 * @author Ji.huazhen
 *
 */
public class BubblingAlgorithm {

	/**
	 * 经典冒泡算法
	 * 
	 * 时间复杂度 O(n^2) -- O(N的2次方)，长度为N的数组，嵌套循环两次
	 * 
	 * 空间复杂度 O(1) 使用了一个额外一个空间用来交换相邻元素
	 * 
	 * @param nums
	 * @return
	 */
	public static int[] classicBubbling(int[] nums) {
		// 双重循环，将数组内最大的元素"冒泡"出来
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				int temp = 0;
				// 升序要求
				if (nums[j] > nums[j + 1]) {
					temp = nums[j];
					nums[j] = nums[j + 1];// 相邻元素替换
					nums[j + 1] = temp;
				}
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 5, 9, 2, 3, 8, 5, 33, 55, 74, 21 };
		int[] result = BubblingAlgorithm.classicBubbling(nums);
		for (int i : result) {
			System.out.println(i);
		}
	}
}
