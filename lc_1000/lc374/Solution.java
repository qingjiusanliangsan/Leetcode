package lc_1000.lc374;
/**
 * @author qingjiusanliangsan
 * create 2021-06-14-10:48
 * lc374.猜数字大小
 */


public class Solution {
    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is lower than the guess number
     *			      1 if num is higher than the guess number
     *               otherwise return 0
     * int guess(int num);
     */
    public int guess(int num){
        return 0;
    }
    public int guessNumber(int n) {
        int a = 1;
        int b = n;
        int c = 0;
        while(a<b){
            c = a +(b-a)/2;
            if(guess(c)==0){
                return c;
            }
            else if(guess(c)==-1){
                b = c-1;

            }
            else if(guess(c)==1){
                a = c+1;
            }
        }
        return a;
    }
}
