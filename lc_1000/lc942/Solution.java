package lc_1000.lc942;

/**
 * @author qingjiusanliangsan
 * create 2021-12-19-23:57
 */
public class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] res = new int[n+1];
        int a=0,b=n;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                res[i] = a++;
            }
            else{
                res[i] = b--;
            }
        }
        res[n]=a;
        return res;
    }
}
