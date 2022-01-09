package LCS.lcs02;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2022-01-09-21:09
 */
public class Solution {
    public int halfQuestions(int[] questions) {
        int res=0;
        int tem=questions.length/2;
        int[] num = new int[1001];
        for(int e:questions){
            ++num[e];
        }
        Arrays.sort(num);
        for(int i=1000;i>0;--i){
            tem-=num[i];
            ++res;
            if(tem<=0){
                return res;
            }
        }
        return res;
    }
}
