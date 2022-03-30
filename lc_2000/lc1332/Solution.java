package lc_2000.lc1332;

public class Solution {
    public int removePalindromeSub(String s) {
        int n = s.length();
        int a=0,b=n-1;
        while (a<b){
            if(s.charAt(a)==s.charAt(b)){
                ++a;
                --b;
            }
            else{
                return 2;
            }
        }
        return 1;
    }
}
