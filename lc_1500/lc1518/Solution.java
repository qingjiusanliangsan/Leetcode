package lc_1500.lc1518;

public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;
        int tem = 0;
        while(numBottles >=numExchange){
            tem = numBottles/numExchange;
            res += tem;
            numBottles = tem + numBottles%numExchange;
        }
        return res;
    }
}