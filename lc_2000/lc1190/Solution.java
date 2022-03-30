package lc_2000.lc1190;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author qingjiusanliangsan
 * create 2021-05-26-11:41
 */
public class Solution {
    public String reverseParentheses(String s) {
        String res = "";
        List<Character> listC = new ArrayList<>();
        Stack<Character> stackC = new Stack<>();
        int n = s.length();
        for(int i =0; i<n; i++){
            if(s.charAt(i) == ')'){
                listC.clear();
                while(!stackC.empty()){
                    char temc = stackC.pop();
                    if(temc != '('){
                        listC.add(temc);
                    }
                    else{
                        for(char c: listC){
                            stackC.add(c);
                        }
                        break;
                    }
                }
            }
            else{
                stackC.add(s.charAt(i));
            }
        }
        listC.clear();
        while(!stackC.empty()){
            listC.add(stackC.pop());
        }
        for(char c: listC){
            res = c + res;
        }
        return res;
    }

}
