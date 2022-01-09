package lc_2000.lc2027;

/**
 * @author qingjiusanliangsan
 * create 2022-01-09-15:08
 */
public class Solution {
    public int minimumMoves(String s) {
        int n = s.length();
        int res=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='X'){
                i=i+2;
                ++res;
            }
        }
        return res;
    }
}
