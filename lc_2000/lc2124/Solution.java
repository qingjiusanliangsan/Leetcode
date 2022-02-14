package lc_2000.lc2124;

/**
 * @author qingjiusanliangsan
 * create 2022-02-14-18:17
 */
public class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='b' && s.charAt(i+1)=='a'){
                return false;
            }
        }
        return true;
    }
}
