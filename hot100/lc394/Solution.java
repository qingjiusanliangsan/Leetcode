package hot100.lc394;

import java.util.Stack;

public class Solution {
    public String decodeString(String s) {
        char[] chararr = s.toCharArray();
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<n;i++){
            if(chararr[i] == ']'){
                String tem = "";
                int k = 1;
                int p = 0;
                while (!stack.empty() && stack.peek() != '['){
                    tem = stack.pop().toString() + tem;
                }
                if(!stack.empty() &&stack.peek() == '['){
                    stack.pop();
                }
                if(!stack.empty() && stack.peek()>='0' && stack.peek()<='9'){
                    p = p*10 + stack.pop()-'0';
                    k = p;
                }
                while (k>0){
                    for(int j=0;j<tem.length();j++){
                        stack.push(tem.charAt(j));
                    }
                    k--;
                }
            }
            else{
                stack.push(chararr[i]);
            }
        }
        String ans = "";
        while (!stack.empty()){
            ans = stack.pop().toString() + ans;
        }
        return ans;
    }
}