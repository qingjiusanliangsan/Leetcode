package Jianzhi.f62;

/**
 * @author qingjiusanliangsan
 * create 2022-07-30-17:32
 */
public class Solution {
    public int lastRemaining(int n, int m) {
        int f = 0;
        for (int i = 2; i != n + 1; ++i) {
            f = (m + f) % i;
        }
        return f;
    }
}