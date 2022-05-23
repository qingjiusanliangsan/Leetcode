package lc_2000.lc2024;

/**
 * @author qingjiusanliangsan
 * create 2022-05-23-14:11
 */
public class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(make(answerKey,k,'T'),make(answerKey,k,'F'));
    }
    public int make(String answerKey, int k,char p) {
        int n = answerKey.length();
        int a = 0,b=0,t=k;
        int res = 1;
        while (b<n){
            t -= answerKey.charAt(b) == p? 0:1;
            while (t<0){
                t += answerKey.charAt(a) == p? 0:1;
                a++;
            }
            res = Math.max(res,b-a+1);

        }
        return res;
    }
}