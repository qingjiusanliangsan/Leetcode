package lc_1000.lc409;

public class Solution {
    public int longestPalindrome(String s) {
        int[] num = new int[53];
        int n=s.length();
        int res=0,flag=0;
        for(int i=0;i<n;i++){
            char tem = s.charAt(i);
            if(tem>='a' && tem<='z'){
                num[tem-'a']++;
            }
            else{
                num[26+tem-'A']++;
            }
        }
        for(int i=0;i<53;i++){
            if(num[i]%2==1){
                flag=1;
                res = res+num[i]-1;
            }
            else{
                res+=num[i];
            }
        }
        return res+flag;
    }
}
