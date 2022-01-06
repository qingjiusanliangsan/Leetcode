package lc_500.lc71;

import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
        Stack<Character> stc = new Stack<>();
        int n = path.length();
        for(int i=0;i<n;i++){
            if(path.charAt(i)=='/'){
                if(stc.empty() || stc.peek() != '/'){
                    stc.push(path.charAt(i));
                }
            }
            else{
                int k=i;
                while (k<n && path.charAt(k)!='/'){
                    ++k;
                }
                if(k-i==1){
                    if(path.charAt(i)=='.'){
                        i=k;
                    }
                    else{
                        stc.push(path.charAt(i));
                    }
                }
                else if(k-i==2 && path.charAt(i)=='.' && path.charAt(i+1)=='.'){
                    if(stc.size()>1)
                        stc.pop();
                    while (stc.size()>1 && stc.peek()!='/'){
                        stc.pop();
                    }
                    i=k;
                }
                else{
                    while (i<k){
                        stc.push(path.charAt(i));
                        ++i;
                    }
                }
            }
        }
        while (stc.size()>1 && stc.peek()=='/'){
            stc.pop();
        }
        int m = stc.size();
        char[] res = new char[m];
        while (! stc.empty()){
            res[m-1] = stc.pop();
            --m;
        }
        return new String(res);
    }
}
