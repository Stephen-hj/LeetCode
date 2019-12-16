package leetcode_simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * author : yhj
 * date   : 2019/12/15
 * desc   :给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * 示例 1:
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * 输入: "{[]}"
 * 输出: true
 */
public class ValidParentheses {

//    public boolean isValid(String s) {//运行效率相当差,
//        if (s.contains("()")||s.contains("[]")||s.contains("{}")){
//            return isValid(s.replace("()", "").replace("[]", "").replace("{}", ""));
//        }else {
//            return "".equals(s);
//        }
//    }

    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (!stack.empty() && stack.peek() != null && map.get(s.charAt(i)).equals(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    //执行效率较高
//    private Map<Character, Character> characters = new HashMap<>();
//    public ValidParentheses() {
//        characters.put('}', '{');
//        characters.put(']', '[');
//        characters.put(')', '(');
//    }
//
//    public boolean isValid(String s) {
//        int length = s.length();
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0, j = length; i < j; i++) {
//            Character c = s.charAt(i);
//            if (this.characters.containsKey(c)) {
//                if (stack.empty()) {
//                    return false;
//                }
//                if (!stack.pop().equals(characters.get(c))) {
//                    return false;
//                }
//            } else {
//                stack.push(c);
//            }
//        }
//        return stack.isEmpty();
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.length() % 2 != 0) {
            System.out.println(false);
        } else if (s.length() == 0 || s == null) {
            System.out.println(true);
        } else {
            ValidParentheses validParentheses = new ValidParentheses();
            System.out.println(validParentheses.isValid(s));
        }

    }
}
