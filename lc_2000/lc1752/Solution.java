package lc_2000.lc1752;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qingjiusanliangsan
 * create 2022-02-13-23:46
 */
public class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen=0;
        int n = rectangles.length;
        int res = 0;
        for(int i=0;i<n;i++){
            int a = Math.min(rectangles[i][0],rectangles[i][1]);
            maxLen = Math.max(a,maxLen);
        }
        for(int i=0;i<n;i++){
            int a = Math.min(rectangles[i][0],rectangles[i][1]);
            if(a==maxLen){
                ++res;
            }
        }
        return res;
    }
}