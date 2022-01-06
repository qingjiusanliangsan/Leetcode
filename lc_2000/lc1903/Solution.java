package lc_2000.lc1903;

public class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        int b=0;
        for(int i=n-1;i>=0;--i){
            int tem = num.charAt(i)-'0';
            if(tem %2 ==1){
                b = i+1;
                break;
            }
        }
        return num.substring(0,b);
    }
}