package lc_1000.lc14;

/**
 * @author qingjiusanliangsan
 * create 2022-02-14-17:42
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int minLen = Integer.MAX_VALUE;
        for(String str : strs){
            minLen = Math.min(minLen,str.length());
        }
        for(int i=0;i<n-1;++i){
            int a=0;
            while (a<minLen && strs[i].charAt(a)==strs[i+1].charAt(a)){
                ++a;
            }
            minLen = a;
        }
        return strs[0].substring(0,minLen);
    }
}