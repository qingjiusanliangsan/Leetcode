package Jianzhi.f05;

public class Solution {
    public String replaceSpace(String s) {
        char[] str = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        for(char c : str){
            if(c==' '){
                ans.append("%20");
            }
            else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}