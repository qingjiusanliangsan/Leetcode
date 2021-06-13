package lc_1000.lc781;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2021-04-04-23:27
 */
public class Solution {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int num=0;
        int len = answers.length;
        int tem=0;
        for(int i=0; i<len; i++){
            tem=answers[i];
            num = num + tem + 1;
            int j =i+1;
            while (j<i+tem+1 && answers[j]==answers[i]){
                j++;
            }
            i = j-1;
        }
        return num;
    }

}
