package lc_2000.lc2108;

public class Solution {
    public String firstPalindrome(String[] words) {
        for(String s: words){
            if(judge(s)){
                return s;
            }
        }
        return "";
    }
    public boolean judge(String s){
        int a=0,b=s.length()-1;
        while (a<b){
            if(s.charAt(a++) != s.charAt(b--)){
                return false;
            }
        }
        return true;
    }
}
