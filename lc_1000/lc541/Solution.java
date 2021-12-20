package lc_1000.lc541;

public class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] st = s.toCharArray();
        int a=0;
        while(a<n){
            if(a+k<=n){
                swp(st,a,a+k-1);
                a = a+2*k;
            }
            else{
                swp(st,a,n-1);
                a = n;
            }
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