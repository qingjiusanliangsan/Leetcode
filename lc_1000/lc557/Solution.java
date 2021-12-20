package lc_1000.lc557;

public class Solution {
    public String reverseWords(String s) {
        int n =s.length();
        char[] st = s.toCharArray();
        int a=0,b1,b2;
        while(a<n){
            b1 = a;
            b2 = a;
            while(b2<n && st[b2] != ' '){
                ++b2;
            }
            a = b2+1;
            --b2;
            swp(st,b1,b2);
        }
        return new String(st);
    }
    public void swp(char[] st,int b1,int b2){
        while(b1<=b2){
            char tem = st[b1];
            st[b1] = st[b2];
            st[b2] = tem;
            ++b1;
            --b2;
        }
    }
}