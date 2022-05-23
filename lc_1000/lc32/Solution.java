package lc_1000.lc32;
import java.util.Stack;

/**
 * @author qingjiusanliangsan
 * create 2022-05-22-20:57
 */

public class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else if(s.charAt(i) == ')'){
                if((!stack.isEmpty() && s.charAt(stack.peek()) == '(')){
                    stack.pop();
                }
                else{
                    stack.push(i);
                }
            }
        }
        if(stack.isEmpty()){
            res = n;
        }
        else{
            int b = n-1;
            int a;
            while (!stack.isEmpty()){
                a = stack.pop();
                res = Math.max(res,b-a);
                b = a-1;
            }
            res = Math.max(res,b+1);
        }
        return res;
    }
}