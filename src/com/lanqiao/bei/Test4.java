package com.lanqiao.bei;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author mikey
 * @create 2022-06-05 20:01
 */
public class Test4 {
    /**
     * 3. 有效的括号
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     * 有效字符串需满足：
     * 3.	左括号必须用相同类型的右括号闭合。
     * 4.	左括号必须以正确的顺序闭合。
     * 示例 1：
     * 输入：s = "()"
     * 输出：true
     * 示例 2：
     * 输入：s = "()[]{}"
     * 输出：true
     * 示例 3：
     * 输入：s = "(]"
     * 输出：false
     * 示例 4：
     * 输入：s = "([)]"
     * 输出：false
     * 示例 5：
     * 输入：s = "{[]}"
     * 输出：true
     *
     * 提示：
     * •	1 <= s.length <= 104
     * •	s 仅由括号 '()[]{}' 组成
     */
    public static void main(String[] args) {
        boolean b = isValid("()");
        System.out.println(b);
    }
    public  static boolean isValid(String s) {
        Deque<String> stack = new LinkedList<>();
        for(int i=0;i < s.length();i++){
            String str = s.substring(i,i+1);
            if(")".equals(str) && stack.size()>0){
                if(stack.peek().equals("(")){
                    stack.poll();
                }
                else{
                    return false;
                }
            }
            else if("]".equals(str)  && stack.size()>0){
                if(stack.peek().equals("[")){
                    stack.poll();
                }
                else{
                    return false;
                }
            }
            else if("}".equals(str)  && stack.size()>0){
                if(stack.peek().equals("{")){
                    stack.poll();
                }
                else{
                    return false;
                }
            }else{
                stack.push(str);
            }

        }
        return stack.size()==0;
    }
}
