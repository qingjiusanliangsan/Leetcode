package lc_1000.lc696;

public class Solution {
    public int countBinarySubstrings(String s) {
        int n = s.length();
        int a,b,res = 0;
        for(int i=1;i<n;i++){
            if(s.charAt(i) != s.charAt(i-1)){
                ++ res;
                a = i-2;
                b= i+1;
                while(a>=0 && b<n){
                    if(s.charAt(a) == s.charAt(a+1) && s.charAt(b) == s.charAt(b-1) && s.charAt(a) != s.charAt(b)){
                        ++res;
                        --a;
                        ++b;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return res;
    }
}