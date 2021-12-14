package lc_500.lc125;

public class Solution {
    public boolean isPalindrome(String s) {
        int n= s.length();
        int a = 0,b=n-1;
        int c1, c2;
        while(a<=b){
            if(s.charAt(a)>='a'&&s.charAt(a)<='z'){
                c1 = s.charAt(a)-'a';
            }
            else if(s.charAt(a)>='A'&&s.charAt(a)<='Z'){
                c1 = s.charAt(a)-'A';
            }
            else if(s.charAt(a)>='0'&&s.charAt(a)<='9'){
                c1 = s.charAt(a)-'0'+26;
            }
            else{
                ++a;
                continue;
            }
            if(s.charAt(b)>='a'&&s.charAt(b)<='z'){
                c2 = s.charAt(b)-'a';
            }
            else if(s.charAt(b)>='A'&&s.charAt(b)<='Z'){
                c2 = s.charAt(b)-'A';
            }
            else if(s.charAt(b)>='0'&&s.charAt(b)<='9'){
                c2 = s.charAt(b)-'0'+26;
            }
            else{
                --b;
                continue;
            }
            if(c1==c2){
                ++a;
                --b;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

