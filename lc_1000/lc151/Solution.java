package lc_1000.lc151;

public class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int a = s.length()-1;
        int b;
        while (a>=0){
            if(s.charAt(a) !=' '){
                b = a;
                while (b>=0 && s.charAt(b)!=' '){
                    --b;
                }
                res.append(s.substring(b+1, a+1)).append(' ');
                a = b;
                continue;
            }
            --a;
        }
        String tem = res.toString();
        return tem.substring(0,tem.length());
    }
}
