package lc_2000.lc1974;

/**
 * @author qingjiusanliangsan
 * create 2022-01-09-13:51
 */
public class Solution {
    public int minTimeToType(String word) {
        int n = word.length();
        int res = n;
        int a=0,b;
        for(int i=0;i<n;i++){
            b=word.charAt(i)-'a';
            if(a<b){
                res = res+Math.min(Math.abs(b-a),26-b+a);
            }
            else if(a>b){
                res = res+Math.min(Math.abs(a-b),26-a+b);
            }
            a = b;
        }
        return res;
    }
}