package lc_2000.lc1893;

/**
 * @author qingjiusanliangsan
 * create 2021-07-23-23:03
 */
public class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        // 0000000011111001111
        // 0000000001110000000
        long data = 0;
        for (int[] range : ranges) {
            data |= (1L << (range[1] + 1)) - (1L << range[0]);
        }

        long tmp = (1L << (right + 1)) - (1L << left);
        return (data & tmp) == tmp;
    }
}
