package lc_1000.lc633;

/**
 * @author qingjiusanliangsan
 * create 2021-04-28-8:47
 */
public class Solution {
    public boolean judgeSquareSum(int c) {
        int IntMax = (int) (Math.sqrt(c));
        int str = 0;
        while(str <= IntMax ){
            double tem = Math.sqrt(c-str*str);
            if(tem == (int)tem){
                return true;
            }
            ++str;
        }
        return false;
    }
}
