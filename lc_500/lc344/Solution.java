package lc_500.lc344;

public class Solution {
    public void reverseString(char[] s) {
        int n =s.length;
        char tem;
        int a=0,b=n-1;
        while(a<=b){
            tem = s[a];
            s[a]=s[b];
            s[b] = tem;
            ++a;
            --b;
        }
    }
}
