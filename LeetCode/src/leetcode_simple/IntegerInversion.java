package leetcode_simple;


import java.util.Scanner;

/**
 * @author yhj
 * @version 2019年12月11日 上午8:39:03
 * @desc 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 示例 1: 输入: 123 输出: 321 示例 2: 输入:
 *       -123 输出: -321 示例 3: 输入: 120 输出: 21 注意: 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为
 *       [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
 *       int取值范围——  -2147483648————2147483647
 */
public class IntegerInversion {

	public int reverse(int x) {
		int rev = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) return 0;
			rev = rev * 10 + pop;
		}
		return rev;
	}
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int x = scanner.nextInt();
			IntegerInversion integerInversion = new IntegerInversion();
			System.out.println(integerInversion.reverse(x));
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);
		} catch (Exception e) {
			System.out.println("数字格式异常！");
		}
	}

}
