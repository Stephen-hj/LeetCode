package leetcode_simple;

import java.util.Scanner;

/**
 * @author yhj
 * @version 2019年12月14日 上午10:04:19
 * @desc 编写一个函数来查找字符串数组中的最长公共前缀。 如果不存在公共前缀，返回空字符串 ""。 示例 1: 输入:
 *       ["flower","flow","flight"] 输出: "fl" 示例 2: 输入: ["dog","racecar","car"]
 *       输出: "" 解释: 输入不存在公共前缀。 说明: 所有输入只包含小写字母 a-z 。
 */
public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		
		if (strs.length<=0) {
			return "";
		}
		
		String num="";
		int b;
		
		for(int i=0;i<strs.length-1;i++) {
			
			for(int j=i+1;j<strs.length;j++) {
				if (strs[i].compareTo(strs[j])>0) {
					String temp=strs[i];
					strs[i]=strs[j];
					strs[j]=temp;
				}
			}
			
		}
		
		
			for( b=0;b<strs[0].length();b++) {
				for(int a=0;a<strs.length-1;a++) {
						if (strs[a+1].charAt(b)!=strs[a].charAt(b)) {
							return strs[0].substring(0,b);
						}
				}
				
			
		}
			return strs[0];
	}
//	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num[]=null;
		num=scanner.nextLine().split(",");
		
		LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
			System.out.println(longestCommonPrefix.longestCommonPrefix(num));
	}
}
