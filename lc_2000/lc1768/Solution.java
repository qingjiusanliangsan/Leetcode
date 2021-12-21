package lc_2000.lc1768;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder st = new StringBuilder();
        int a=0,b=0;
        while (a<word1.length() && b< word2.length()){
            st.append(word1.charAt(a++));
            st.append(word2.charAt(b++));
        }
        if(a>=word1.length()){
            if(b<word2.length()){
                st.append(word2.substring(b));
            }
        }
        else{
            st.append(word1.substring(a));
        }
        return st.toString();
    }
}