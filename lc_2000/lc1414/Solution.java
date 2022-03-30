package lc_2000.lc1414;

/**
 * @author qingjiusanliangsan
 * create 2022-02-03-22:21
 */
public class Solution {
    public int findMinFibonacciNumbers(int k) {
        int res = 0;
        do{
            k = k-finmax(k);
            ++res;
        }while (k>0);
        return res;
    }
    public int finmax(int k){
        int f1 = 1;
        int f2 = 1;
        int tem;
        while (f2<=k){
            tem = f2;
            f2 = f1+f2;
            f1 = tem;
        }
        return f1;
    }
}