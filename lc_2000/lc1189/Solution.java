package lc_2000.lc1189;

/**
 * @author qingjiusanliangsan
 * create 2022-02-13-13:13
 */
public class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        int[] num = new int[26];
        for(int i=0;i<n;i++){
            ++num[text.charAt(i)-'a'];
        }
        int res = Math.min(num['b'-'a'],num[0]);
        res = Math.min(num['n'-'a'],res);
        res = Math.min(num['l'-'a']/2,res);
        return Math.min(num['o'-'a']/2,res);
    }
}
