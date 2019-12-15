package leetcode_simple;

import java.util.Scanner;

/**
 * @author yhj
 * @version 2019年12月10日 上午9:06:21
 * @desc 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *       你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。 示例: 给定 nums = [2, 7, 11,
 *       15],target = 9 因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1]
 */
public class TwoNumbersSum {

	public int[] twoSum(int[] nums, int target) {
		for (int a = 0; a < nums.length; a++) {
			for (int b = a + 1; b < nums.length; b++) {
				if (target == nums[b] + nums[a]) {
					return new int[] {a,b};
				}
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = null;
		num = sc.nextLine().split(",");
		int nums[] = new int[num.length];
		Scanner scanner = new Scanner(System.in);
		int target = scanner.nextInt();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.valueOf(num[i]);
		}
		TwoNumbersSum tSum = new TwoNumbersSum();
		int[] twoSum = tSum.twoSum(nums, target);
		for (int c = 0; c < twoSum.length; c++) {
			System.out.println(twoSum[c]);
		}
	}

}
