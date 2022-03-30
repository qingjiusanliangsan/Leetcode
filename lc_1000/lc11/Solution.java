package lc_1000.lc11;

/**
 * @author qingjiusanliangsan
 * create 2021-12-25-22:39
 */
public class Solution {
    public int maxArea(int[] height) {
        int a=0,b=height.length-1,res =0;
        while (a<b){
            int tem = (b-a)*Math.min(height[a],height[b]);
            res = Math.max(res,tem);
            if(height[a]<=height[b]){
                ++a;
            }
            else{
                --b;
            }
        }
        return res;
    }
}